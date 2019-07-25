//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.structured_light;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.utils.Converters;

// C++: class StructuredLightPattern
//javadoc: StructuredLightPattern

public class StructuredLightPattern extends Algorithm {

    protected StructuredLightPattern(long addr) { super(addr); }

    // internal usage only
    public static StructuredLightPattern __fromPtr__(long addr) { return new StructuredLightPattern(addr); }

    //
    // C++:  bool cv::structured_light::StructuredLightPattern::decode(vector_vector_Mat patternImages, Mat& disparityMap, vector_Mat blackImages = vector_Mat(), vector_Mat whiteImages = vector_Mat(), int flags = DECODE_3D_UNDERWORLD)
    //

    // Unknown type 'vector_vector_Mat' (I), skipping the function


    //
    // C++:  bool cv::structured_light::StructuredLightPattern::generate(vector_Mat& patternImages)
    //

    //javadoc: StructuredLightPattern::generate(patternImages)
    public  boolean generate(List<Mat> patternImages)
    {
        Mat patternImages_mat = new Mat();
        boolean retVal = generate_0(nativeObj, patternImages_mat.nativeObj);
        Converters.Mat_to_vector_Mat(patternImages_mat, patternImages);
        patternImages_mat.release();
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool cv::structured_light::StructuredLightPattern::generate(vector_Mat& patternImages)
    private static native boolean generate_0(long nativeObj, long patternImages_mat_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
