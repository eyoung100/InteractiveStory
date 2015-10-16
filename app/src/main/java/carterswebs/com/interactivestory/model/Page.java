package carterswebs.com.interactivestory.model;

public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;

    public int getImageId() {
        return mImageId;
    }

    public void setImageId (int id) {
        mImageId = id;
    }
}
