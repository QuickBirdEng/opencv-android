//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import org.opencv.face.BasicFaceRecognizer;
import org.opencv.face.FisherFaceRecognizer;

// C++: class FisherFaceRecognizer
//javadoc: FisherFaceRecognizer

public class FisherFaceRecognizer extends BasicFaceRecognizer {

    protected FisherFaceRecognizer(long addr) { super(addr); }

    // internal usage only
    public static FisherFaceRecognizer __fromPtr__(long addr) { return new FisherFaceRecognizer(addr); }

    //
    // C++: static Ptr_FisherFaceRecognizer cv::face::FisherFaceRecognizer::create(int num_components = 0, double threshold = DBL_MAX)
    //

    //javadoc: FisherFaceRecognizer::create(num_components, threshold)
    public static FisherFaceRecognizer create(int num_components, double threshold)
    {
        
        FisherFaceRecognizer retVal = FisherFaceRecognizer.__fromPtr__(create_0(num_components, threshold));
        
        return retVal;
    }

    //javadoc: FisherFaceRecognizer::create(num_components)
    public static FisherFaceRecognizer create(int num_components)
    {
        
        FisherFaceRecognizer retVal = FisherFaceRecognizer.__fromPtr__(create_1(num_components));
        
        return retVal;
    }

    //javadoc: FisherFaceRecognizer::create()
    public static FisherFaceRecognizer create()
    {
        
        FisherFaceRecognizer retVal = FisherFaceRecognizer.__fromPtr__(create_2());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_FisherFaceRecognizer cv::face::FisherFaceRecognizer::create(int num_components = 0, double threshold = DBL_MAX)
    private static native long create_0(int num_components, double threshold);
    private static native long create_1(int num_components);
    private static native long create_2();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
