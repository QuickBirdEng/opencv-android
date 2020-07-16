//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Rect2d;

// C++: class Tracker
/**
 * Base abstract class for the long-term tracker:
 */
public class Tracker extends Algorithm {

    protected Tracker(long addr) { super(addr); }

    // internal usage only
    public static Tracker __fromPtr__(long addr) { return new Tracker(addr); }

    //
    // C++:  bool cv::Tracker::init(Mat image, Rect2d boundingBox)
    //

    /**
     * Initialize the tracker with a known bounding box that surrounded the target
     *     @param image The initial frame
     *     @param boundingBox The initial bounding box
     *
     *     @return True if initialization went succesfully, false otherwise
     */
    public boolean init(Mat image, Rect2d boundingBox) {
        return init_0(nativeObj, image.nativeObj, boundingBox.x, boundingBox.y, boundingBox.width, boundingBox.height);
    }


    //
    // C++:  bool cv::Tracker::update(Mat image, Rect2d& boundingBox)
    //

    /**
     * Update the tracker, find the new most likely bounding box for the target
     *     @param image The current frame
     *     @param boundingBox The bounding box that represent the new target location, if true was returned, not
     *     modified otherwise
     *
     *     @return True means that target was located and false means that tracker cannot locate target in
     *     current frame. Note, that latter *does not* imply that tracker has failed, maybe target is indeed
     *     missing from the frame (say, out of sight)
     */
    public boolean update(Mat image, Rect2d boundingBox) {
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
