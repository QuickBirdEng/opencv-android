//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;

// C++: class MSDDetector
/**
 * Class implementing the MSD (*Maximal Self-Dissimilarity*) keypoint detector, described in CITE: Tombari14.
 *
 * The algorithm implements a novel interest point detector stemming from the intuition that image patches
 * which are highly dissimilar over a relatively large extent of their surroundings hold the property of
 * being repeatable and distinctive. This concept of "contextual self-dissimilarity" reverses the key
 * paradigm of recent successful techniques such as the Local Self-Similarity descriptor and the Non-Local
 * Means filter, which build upon the presence of similar - rather than dissimilar - patches. Moreover,
 * it extends to contextual information the local self-dissimilarity notion embedded in established
 * detectors of corner-like interest points, thereby achieving enhanced repeatability, distinctiveness and
 * localization accuracy.
 */
public class MSDDetector extends Feature2D {

    protected MSDDetector(long addr) { super(addr); }

    // internal usage only
    public static MSDDetector __fromPtr__(long addr) { return new MSDDetector(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
