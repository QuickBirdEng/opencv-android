//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.face.MACE;
import org.opencv.utils.Converters;

// C++: class MACE
//javadoc: MACE

public class MACE extends Algorithm {

    protected MACE(long addr) { super(addr); }

    // internal usage only
    public static MACE __fromPtr__(long addr) { return new MACE(addr); }

    //
    // C++: static Ptr_MACE cv::face::MACE::create(int IMGSIZE = 64)
    //

    //javadoc: MACE::create(IMGSIZE)
    public static MACE create(int IMGSIZE)
    {
        
        MACE retVal = MACE.__fromPtr__(create_0(IMGSIZE));
        
        return retVal;
    }

    //javadoc: MACE::create()
    public static MACE create()
    {
        
        MACE retVal = MACE.__fromPtr__(create_1());
        
        return retVal;
    }


    //
    // C++: static Ptr_MACE cv::face::MACE::load(String filename, String objname = String())
    //

    //javadoc: MACE::load(filename, objname)
    public static MACE load(String filename, String objname)
    {
        
        MACE retVal = MACE.__fromPtr__(load_0(filename, objname));
        
        return retVal;
    }

    //javadoc: MACE::load(filename)
    public static MACE load(String filename)
    {
        
        MACE retVal = MACE.__fromPtr__(load_1(filename));
        
        return retVal;
    }


    //
    // C++:  bool cv::face::MACE::same(Mat query)
    //

    //javadoc: MACE::same(query)
    public  boolean same(Mat query)
    {
        
        boolean retVal = same_0(nativeObj, query.nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::face::MACE::salt(String passphrase)
    //

    //javadoc: MACE::salt(passphrase)
    public  void salt(String passphrase)
    {
        
        salt_0(nativeObj, passphrase);
        
        return;
    }


    //
    // C++:  void cv::face::MACE::train(vector_Mat images)
    //

    //javadoc: MACE::train(images)
    public  void train(List<Mat> images)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        train_0(nativeObj, images_mat.nativeObj);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_MACE cv::face::MACE::create(int IMGSIZE = 64)
    private static native long create_0(int IMGSIZE);
    private static native long create_1();

    // C++: static Ptr_MACE cv::face::MACE::load(String filename, String objname = String())
    private static native long load_0(String filename, String objname);
    private static native long load_1(String filename);

    // C++:  bool cv::face::MACE::same(Mat query)
    private static native boolean same_0(long nativeObj, long query_nativeObj);

    // C++:  void cv::face::MACE::salt(String passphrase)
    private static native void salt_0(long nativeObj, String passphrase);

    // C++:  void cv::face::MACE::train(vector_Mat images)
    private static native void train_0(long nativeObj, long images_mat_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
