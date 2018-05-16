package customlibraries.db.com.pathwaybutton;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;

import customlibraries.db.com.pathwaybutton.widgets.TextView;

public class PathwayButton extends TextView {

    /**
     * Constructor
     *
     * @param context allows access to application-specific resources and classes
     */
    public PathwayButton(Context context) {
        super(context);
        if (!isInEditMode())
            touchUp();
    }

    /**
     * Animates the button by changing its size and graphical representation when it is restored to its original form after animation.
     */
    private void touchUp() {
        getBackground().setAlpha(255);
        animate().scaleX(1F).scaleY(1F).setDuration(50).setStartDelay(0);
    }

    /**
     * @param context allows access to application-specific resources and classes
     * @param attrs   collection of attributes
     * @see #touchUp()
     */
    public PathwayButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode())
            touchUp();
    }

    /**
     * @param context  allows access to application-specific resources and classes
     * @param attrs    collection of attributes
     * @param defStyle contains a reference to a style resource that supplies defaults values for the StyledAttributes.
     * @see #touchUp()
     */
    public PathwayButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (!isInEditMode())
            touchUp();
    }

    /**
     * Triggers different Touch events when the button is clicked
     *
     * @return a boolean value based on the action code .The Action Code specifies the state change that occurred.
     */
    @Override
    public boolean onTouchEvent(@NonNull MotionEvent event) {
        int action = MotionEventCompat.getActionMasked(event);
        switch (action) {
            case (MotionEvent.ACTION_DOWN):
                touchDown();
                break;
            case (MotionEvent.ACTION_UP):
                touchUp();
                break;
            case (MotionEvent.ACTION_CANCEL):
                touchUp();
                break;
            case (MotionEvent.ACTION_OUTSIDE):
                touchUp();
                break;
        }
        return super.onTouchEvent(event);
    }

    /**
     * Animates the button by changing its size and graphical representation when the button is clicked.
     */
    private void touchDown() {
        getBackground().setAlpha(150);
        animate().scaleX(0.95F).scaleY(0.95F).setDuration(50).setStartDelay(0);
    }
}
