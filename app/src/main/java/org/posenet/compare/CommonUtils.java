package org.posenet.compare;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CommonUtils {

    public static double similarity(@NotNull ArrayList<Double> galleryPersonList,
                                    @NotNull ArrayList<Double> testPersonList) {

        double[] vec1;
        double[] vec2;

        vec1 = new double[galleryPersonList.size()];
        for (int j = 0; j < galleryPersonList.size(); j++) {
            vec1[j] = galleryPersonList.get(j);
        }

        vec2 = new double[testPersonList.size()];
        for (int j = 0; j < testPersonList.size(); j++) {
            vec2[j] = testPersonList.get(j);
        }

        double dop = 0;
        for (int n = 0; n < vec1.length; n++)
            dop += vec1[n] * vec2[n];

        double mag1 = 0.0, mag2 = 0.0;
        for (int n = 0; n < vec1.length; n++) {
            mag1 += Math.pow(vec1[n], 2);
            mag2 += Math.pow(vec2[n], 2);
        }

        mag1 = Math.sqrt(mag1);
        mag2 = Math.sqrt(mag2);

        double csim = dop / (mag1 * mag2);
        return csim;
    }

}
