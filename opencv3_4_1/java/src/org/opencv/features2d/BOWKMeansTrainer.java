//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

import org.opencv.core.Mat;
import org.opencv.core.TermCriteria;

// C++: class BOWKMeansTrainer
//javadoc: BOWKMeansTrainer

public class BOWKMeansTrainer extends BOWTrainer {

    protected BOWKMeansTrainer(long addr) { super(addr); }

    //javadoc: BOWKMeansTrainer::BOWKMeansTrainer(clusterCount, termcrit, attempts, flags)
    public   BOWKMeansTrainer(int clusterCount, TermCriteria termcrit, int attempts, int flags)
    {

        super( BOWKMeansTrainer_0(clusterCount, termcrit.type, termcrit.maxCount, termcrit.epsilon, attempts, flags) );

        return;
    }

    //
    // C++:   BOWKMeansTrainer(int clusterCount, TermCriteria termcrit = TermCriteria(), int attempts = 3, int flags = KMEANS_PP_CENTERS)
    //

    //javadoc: BOWKMeansTrainer::BOWKMeansTrainer(clusterCount)
    public   BOWKMeansTrainer(int clusterCount)
    {

        super( BOWKMeansTrainer_1(clusterCount) );

        return;
    }

    // internal usage only
    public static BOWKMeansTrainer __fromPtr__(long addr) { return new BOWKMeansTrainer(addr); }


    //
    // C++:  Mat cluster(Mat descriptors)
    //

    // C++:   BOWKMeansTrainer(int clusterCount, TermCriteria termcrit = TermCriteria(), int attempts = 3, int flags = KMEANS_PP_CENTERS)
    private static native long BOWKMeansTrainer_0(int clusterCount, int termcrit_type, int termcrit_maxCount, double termcrit_epsilon, int attempts, int flags);


    //
    // C++:  Mat cluster()
    //

    private static native long BOWKMeansTrainer_1(int clusterCount);

    // C++:  Mat cluster(Mat descriptors)
    private static native long cluster_0(long nativeObj, long descriptors_nativeObj);

    // C++:  Mat cluster()
    private static native long cluster_1(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    //javadoc: BOWKMeansTrainer::cluster(descriptors)
    public  Mat cluster(Mat descriptors)
    {

        Mat retVal = new Mat(cluster_0(nativeObj, descriptors.nativeObj));

        return retVal;
    }

    //javadoc: BOWKMeansTrainer::cluster()
    public  Mat cluster()
    {

        Mat retVal = new Mat(cluster_1(nativeObj));

        return retVal;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
