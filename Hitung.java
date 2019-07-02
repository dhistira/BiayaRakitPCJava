/*
 * Aplikasi Hitung Biaya Rakit PC untuk Tugas Besar SDA
 * 
 * Oleh:
 * Salma Nida Khofiyya - M0518053
 * Tsamrotul Fathiyah Naelarohmah - M0518062
 * Yudhistira Bayu Wryatsongko - M0517053
 */
package rakitpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hitung {

    static int[] processorHarga = {1040000, 2665000, 4675000, 7700000, 10175000};
    static int[] RAMHarga = {850000, 987000, 1908000,5625000};
    static int[] VGAHarga = {1595000, 3120000, 4540000};
    static int[] HDDHarga = {704000, 1069000, 1856000, 4980000};

    static int[] processorCapacity = {3600, 4000, 4600, 4900, 5000};
    static int[] RAMCapacity = {4000, 8000, 16000, 32000};
    static int[] VGACapacity = {2000, 3000, 11460};
    static int[] HDDCapacity = {1000, 2000, 4000, 6000};

    static String[] Processors = {"Intel Pentium G4600", "Intel i3-8350K", "Intel i5-9600K", "Intel i7-9700K", "Intel i9-9900K"};
    static String[] RAM = {"CORSAIR 4GB DDR4", "TEAM 2 x 4GB DDR4", "TEAM 2x8GB DDR4", "CORSAIR 2 x 16GB DDR4"};
    static String[] VGA = {"Radeon RX 550 2GB DDR5", "GeForce GTX 1060 3GB DDR5", "Radeon RX 580 4GB DDR5"};
    static String[] HDD = {"SEAGATE Barracuda 1TB", "SEAGATE Barracuda 2TB", "SEAGATE Skyhawk 4TB", "SEAGATE Enterprise CAP SATA 6TB"};

    static int ProcessorIndex;
    static int RAMIndex;
    static int VGAIndex;
    static int HDDIndex;

    static List<String> Knap(int budget) {
        List<Integer> BestCapacity = new ArrayList<>();
        List<String> Results = new ArrayList<>();
        List<Integer> processorIdent = new ArrayList<>();
        List<Integer> RAMIdent = new ArrayList<>();
        List<Integer> VGAIdent = new ArrayList<>();
        List<Integer> HDDIdent = new ArrayList<>();

        for (int i = 0; i <= (processorHarga.length) - 1; ++i) {
            int a = processorHarga[i];
            int e = processorCapacity[i];
            for (int j = 0; j <= (RAMHarga.length) - 1; ++j) {
                int b = RAMHarga[j];
                int f = RAMCapacity[j];
                for (int k = 0; k <= (VGAHarga.length) - 1; ++k) {
                    int c = VGAHarga[k];
                    int g = VGACapacity[k];
                    for (int l = 0; l <= (HDDHarga.length) - 1; ++l) {
                        int d = HDDHarga[l];
                        int h = HDDCapacity[l];
                        int totalW = a + b + c + d;
                        int totalP = e + f + g + h;
                        if (totalW <= budget) {
                            BestCapacity.add(totalP);
                            processorIdent.add(i);
                            RAMIdent.add(j);
                            VGAIdent.add(k);
                            HDDIdent.add(l);
                        }

                    }

                }

            }

        }

        int maxCapacity = Collections.max(BestCapacity);
        int x = BestCapacity.indexOf(maxCapacity);

        ProcessorIndex = processorIdent.get(x);
        RAMIndex = RAMIdent.get(x);
        VGAIndex = VGAIdent.get(x);
        HDDIndex = HDDIdent.get(x);

        Results.add(Processors[ProcessorIndex]);
        Results.add(RAM[RAMIndex]);
        Results.add(VGA[VGAIndex]);
        Results.add(HDD[HDDIndex]);

        return Results;
    }

    static List<Integer> totalHarga() {
        List<Integer> totalBiaya;
        totalBiaya = new ArrayList<>();
        totalBiaya.add(processorHarga[ProcessorIndex]);
        totalBiaya.add(RAMHarga[RAMIndex]);
        totalBiaya.add(VGAHarga[VGAIndex]);
        totalBiaya.add(HDDHarga[HDDIndex]);

        return totalBiaya;
    }

    static int minimumBiaya() {
        int processorHarga1;
        int VGAHarga1;
        int HDDHarga1;
        int RAMHarga1;

        processorHarga1 = Hitung.processorHarga[0];
        RAMHarga1 = Hitung.RAMHarga[0];
        VGAHarga1 = Hitung.VGAHarga[0];
        HDDHarga1 = Hitung.HDDHarga[0];

        int min = processorHarga1 + VGAHarga1 + HDDHarga1 + RAMHarga1;
        
        return min;
    }
}
