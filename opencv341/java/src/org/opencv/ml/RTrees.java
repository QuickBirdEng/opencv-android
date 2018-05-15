//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;

import org.opencv.core.Mat;
import org.opencv.core.TermCriteria;

// C++: class RTrees
//javadoc: RTrees

public class RTrees extends DTrees {

    protected RTrees(long addr) { super(addr); }

    // internal usage only
    public static RTrees __fromPtr__(long addr) { return new RTrees(addr); }

    //
    // C++:  Mat getVarImportance()
    //

    //javadoc: RTrees::create()
    public static RTrees create()
    {

        RTrees retVal = RTrees.__fromPtr__(create_0());

        return retVal;
    }


    //
    // C++: static Ptr_RTrees create()
    //

    //javadoc: RTrees::load(filepath, nodeName)
    public static RTrees load(String filepath, String nodeName)
    {

        RTrees retVal = RTrees.__fromPtr__(load_0(filepath, nodeName));

        return retVal;
    }


    //
    // C++: static Ptr_RTrees load(String filepath, String nodeName = String())
    //

    //javadoc: RTrees::load(filepath)
    public static RTrees load(String filepath)
    {

        RTrees retVal = RTrees.__fromPtr__(load_1(filepath));

        return retVal;
    }

    // C++:  Mat getVarImportance()
    private static native long getVarImportance_0(long nativeObj);


    //
    // C++:  TermCriteria getTermCriteria()
    //

    // C++: static Ptr_RTrees create()
    private static native long create_0();


    //
    // C++:  bool getCalculateVarImportance()
    //

    // C++: static Ptr_RTrees load(String filepath, String nodeName = String())
    private static native long load_0(String filepath, String nodeName);


    //
    // C++:  int getActiveVarCount()
    //

    private static native long load_1(String filepath);


    //
    // C++:  void getVotes(Mat samples, Mat& results, int flags)
    //

    // C++:  TermCriteria getTermCriteria()
    private static native double[] getTermCriteria_0(long nativeObj);


    //
    // C++:  void setActiveVarCount(int val)
    //

    // C++:  bool getCalculateVarImportance()
    private static native boolean getCalculateVarImportance_0(long nativeObj);


    //
    // C++:  void setCalculateVarImportance(bool val)
    //

    // C++:  int getActiveVarCount()
    private static native int getActiveVarCount_0(long nativeObj);


    //
    // C++:  void setTermCriteria(TermCriteria val)
    //

    // C++:  void getVotes(Mat samples, Mat& results, int flags)
    private static native void getVotes_0(long nativeObj, long samples_nativeObj, long results_nativeObj, int flags);

    // C++:  void setActiveVarCount(int val)
    private static native void setActiveVarCount_0(long nativeObj, int val);

    // C++:  void setCalculateVarImportance(bool val)
    private static native void setCalculateVarImportance_0(long nativeObj, boolean val);

    // C++:  void setTermCriteria(TermCriteria val)
    private static native void setTermCriteria_0(long nativeObj, int val_type, int val_maxCount, double val_epsilon);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    //javadoc: RTrees::getVarImportance()
    public  Mat getVarImportance()
    {

        Mat retVal = new Mat(getVarImportance_0(nativeObj));

        return retVal;
    }

    //javadoc: RTrees::getTermCriteria()
    public  TermCriteria getTermCriteria()
    {

        TermCriteria retVal = new TermCriteria(getTermCriteria_0(nativeObj));

        return retVal;
    }

    //javadoc: RTrees::getCalculateVarImportance()
    public  boolean getCalculateVarImportance()
    {

        boolean retVal = getCalculateVarImportance_0(nativeObj);

        return retVal;
    }

    //javadoc: RTrees::getActiveVarCount()
    public  int getActiveVarCount()
    {

        int retVal = getActiveVarCount_0(nativeObj);

        return retVal;
    }

    //javadoc: RTrees::getVotes(samples, results, flags)
    public  void getVotes(Mat samples, Mat results, int flags)
    {

        getVotes_0(nativeObj, samples.nativeObj, results.nativeObj, flags);

        return;
    }

    //javadoc: RTrees::setActiveVarCount(val)
    public  void setActiveVarCount(int val)
    {

        setActiveVarCount_0(nativeObj, val);

        return;
    }

    //javadoc: RTrees::setCalculateVarImportance(val)
    public  void setCalculateVarImportance(boolean val)
    {

        setCalculateVarImportance_0(nativeObj, val);

        return;
    }

    //javadoc: RTrees::setTermCriteria(val)
    public  void setTermCriteria(TermCriteria val)
    {

        setTermCriteria_0(nativeObj, val.type, val.maxCount, val.epsilon);

        return;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
