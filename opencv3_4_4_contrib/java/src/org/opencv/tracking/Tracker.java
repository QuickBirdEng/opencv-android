//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Rect2d;

// C++: class Tracker
//javadoc: Tracker

public class Tracker extends Algorithm {

    protected Tracker(long addr) { super(addr); }

    // internal usage only
    public static Tracker __fromPtr__(long addr) { return new Tracker(addr); }

    //
    // C++:  bool cv::Tracker::init(Mat image, Rect2d boundingBox)
    //

    //javadoc: Tracker::init(image, boundingBox)
    public  boolean init(Mat image, Rect2d boundingBox)
    {
        
        boolean retVal = init_0(nativeObj, image.nativeObj, boundingBox.x, boundingBox.y, boundingBox.width, boundingBox.height);
        
        return retVal;
    }


    //
    // C++:  bool cv::Tracker::update(Mat image, Rect2d& boundingBox)
    //

    //javadoc: Tracker::update(image, boundingBox)
    public  boolean update(Mat image, Rect2d boundingBox)
    {
        double[] boundingBox_out = new double[4];
        boolean retVal = update_0(nativeObj, image.nativeObj, boundingBox_out);
        if(boundingBox!=null){ boundingBox.x = boundingBox_out[0]; boundingBox.y = boundingBox_out[1]; boundingBox.width = boundingBox_out[2]; boundingBox.height = boundingBox_out[3]; } 
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool cv::Tracker::init(Mat image, Rect2d boundingBox)
    private static native boolean init_0(long nativeObj, long image_nativeObj, double boundingBox_x, double boundingBox_y, double boundingBox_width, double boundingBox_height);

    // C++:  bool cv::Tracker::update(Mat image, Rect2d& boundingBox)
    private static native boolean update_0(long nativeObj, long image_nativeObj, double[] boundingBox_out);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
