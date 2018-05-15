//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

import org.opencv.core.Mat;
import org.opencv.utils.Converters;

import java.util.ArrayList;
import java.util.List;

// C++: class BOWTrainer
//javadoc: BOWTrainer

public class BOWTrainer {

    protected final long nativeObj;
    protected BOWTrainer(long addr) { nativeObj = addr; }

    // internal usage only
    public static BOWTrainer __fromPtr__(long addr) { return new BOWTrainer(addr); }

    // C++:  Mat cluster(Mat descriptors)
    private static native long cluster_0(long nativeObj, long descriptors_nativeObj);

    //
    // C++:  Mat cluster(Mat descriptors)
    //

    // C++:  Mat cluster()
    private static native long cluster_1(long nativeObj);


    //
    // C++:  Mat cluster()
    //

    // C++:  int descriptorsCount()
    private static native int descriptorsCount_0(long nativeObj);


    //
    // C++:  int descriptorsCount()
    //

    // C++:  vector_Mat getDescriptors()
    private static native long getDescriptors_0(long nativeObj);


    //
    // C++:  vector_Mat getDescriptors()
    //

    // C++:  void add(Mat descriptors)
    private static native void add_0(long nativeObj, long descriptors_nativeObj);


    //
    // C++:  void add(Mat descriptors)
    //

    // C++:  void clear()
    private static native void clear_0(long nativeObj);


    //
    // C++:  void clear()
    //

    // native support for java finalize()
    private static native void delete(long nativeObj);

    public long getNativeObjAddr() { return nativeObj; }

    //javadoc: BOWTrainer::cluster(descriptors)
    public  Mat cluster(Mat descriptors)
    {

        Mat retVal = new Mat(cluster_0(nativeObj, descriptors.nativeObj));

        return retVal;
    }

    //javadoc: BOWTrainer::cluster()
    public  Mat cluster()
    {

        Mat retVal = new Mat(cluster_1(nativeObj));

        return retVal;
    }

    //javadoc: BOWTrainer::descriptorsCount()
    public  int descriptorsCount()
    {

        int retVal = descriptorsCount_0(nativeObj);

        return retVal;
    }

    //javadoc: BOWTrainer::getDescriptors()
    public  List<Mat> getDescriptors()
    {
        List<Mat> retVal = new ArrayList<Mat>();
        Mat retValMat = new Mat(getDescriptors_0(nativeObj));
        Converters.Mat_to_vector_Mat(retValMat, retVal);
        return retVal;
    }

    //javadoc: BOWTrainer::add(descriptors)
    public  void add(Mat descriptors)
    {

        add_0(nativeObj, descriptors.nativeObj);

        return;
    }

    //javadoc: BOWTrainer::clear()
    public  void clear()
    {

        clear_0(nativeObj);

        return;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
