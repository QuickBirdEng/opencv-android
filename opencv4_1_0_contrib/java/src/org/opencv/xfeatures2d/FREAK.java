//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.features2d.Feature2D;
import org.opencv.utils.Converters;
import org.opencv.xfeatures2d.FREAK;

// C++: class FREAK
//javadoc: FREAK

public class FREAK extends Feature2D {

    protected FREAK(long addr) { super(addr); }

    // internal usage only
    public static FREAK __fromPtr__(long addr) { return new FREAK(addr); }

    //
    // C++: static Ptr_FREAK cv::xfeatures2d::FREAK::create(bool orientationNormalized = true, bool scaleNormalized = true, float patternScale = 22.0f, int nOctaves = 4, vector_int selectedPairs = std::vector<int>())
    //

    //javadoc: FREAK::create(orientationNormalized, scaleNormalized, patternScale, nOctaves, selectedPairs)
    public static FREAK create(boolean orientationNormalized, boolean scaleNormalized, float patternScale, int nOctaves, MatOfInt selectedPairs)
    {
        Mat selectedPairs_mat = selectedPairs;
        FREAK retVal = FREAK.__fromPtr__(create_0(orientationNormalized, scaleNormalized, patternScale, nOctaves, selectedPairs_mat.nativeObj));
        
        return retVal;
    }

    //javadoc: FREAK::create(orientationNormalized, scaleNormalized, patternScale, nOctaves)
    public static FREAK create(boolean orientationNormalized, boolean scaleNormalized, float patternScale, int nOctaves)
    {
        
        FREAK retVal = FREAK.__fromPtr__(create_1(orientationNormalized, scaleNormalized, patternScale, nOctaves));
        
        return retVal;
    }

    //javadoc: FREAK::create(orientationNormalized, scaleNormalized, patternScale)
    public static FREAK create(boolean orientationNormalized, boolean scaleNormalized, float patternScale)
    {
        
        FREAK retVal = FREAK.__fromPtr__(create_2(orientationNormalized, scaleNormalized, patternScale));
        
        return retVal;
    }

    //javadoc: FREAK::create(orientationNormalized, scaleNormalized)
    public static FREAK create(boolean orientationNormalized, boolean scaleNormalized)
    {
        
        FREAK retVal = FREAK.__fromPtr__(create_3(orientationNormalized, scaleNormalized));
        
        return retVal;
    }

    //javadoc: FREAK::create(orientationNormalized)
    public static FREAK create(boolean orientationNormalized)
    {
        
        FREAK retVal = FREAK.__fromPtr__(create_4(orientationNormalized));
        
        return retVal;
    }

    //javadoc: FREAK::create()
    public static FREAK create()
    {
        
        FREAK retVal = FREAK.__fromPtr__(create_5());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_FREAK cv::xfeatures2d::FREAK::create(bool orientationNormalized = true, bool scaleNormalized = true, float patternScale = 22.0f, int nOctaves = 4, vector_int selectedPairs = std::vector<int>())
    private static native long create_0(boolean orientationNormalized, boolean scaleNormalized, float patternScale, int nOctaves, long selectedPairs_mat_nativeObj);
    private static native long create_1(boolean orientationNormalized, boolean scaleNormalized, float patternScale, int nOctaves);
    private static native long create_2(boolean orientationNormalized, boolean scaleNormalized, float patternScale);
    private static native long create_3(boolean orientationNormalized, boolean scaleNormalized);
    private static native long create_4(boolean orientationNormalized);
    private static native long create_5();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
