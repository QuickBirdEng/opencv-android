//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import org.opencv.face.BasicFaceRecognizer;
import org.opencv.face.EigenFaceRecognizer;

// C++: class EigenFaceRecognizer
//javadoc: EigenFaceRecognizer

public class EigenFaceRecognizer extends BasicFaceRecognizer {

    protected EigenFaceRecognizer(long addr) { super(addr); }

    // internal usage only
    public static EigenFaceRecognizer __fromPtr__(long addr) { return new EigenFaceRecognizer(addr); }

    //
    // C++: static Ptr_EigenFaceRecognizer cv::face::EigenFaceRecognizer::create(int num_components = 0, double threshold = DBL_MAX)
    //

    //javadoc: EigenFaceRecognizer::create(num_components, threshold)
    public static EigenFaceRecognizer create(int num_components, double threshold)
    {
        
        EigenFaceRecognizer retVal = EigenFaceRecognizer.__fromPtr__(create_0(num_components, threshold));
        
        return retVal;
    }

    //javadoc: EigenFaceRecognizer::create(num_components)
    public static EigenFaceRecognizer create(int num_components)
    {
        
        EigenFaceRecognizer retVal = EigenFaceRecognizer.__fromPtr__(create_1(num_components));
        
        return retVal;
    }

    //javadoc: EigenFaceRecognizer::create()
    public static EigenFaceRecognizer create()
    {
        
        EigenFaceRecognizer retVal = EigenFaceRecognizer.__fromPtr__(create_2());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_EigenFaceRecognizer cv::face::EigenFaceRecognizer::create(int num_components = 0, double threshold = DBL_MAX)
    private static native long create_0(int num_components, double threshold);
    private static native long create_1(int num_components);
    private static native long create_2();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
