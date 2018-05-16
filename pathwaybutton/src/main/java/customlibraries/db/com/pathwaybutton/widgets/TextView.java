package customlibraries.db.com.pathwaybutton.widgets;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;


public class TextView extends AppCompatTextView {

    /**
     * Constructor
     *
     * @param context allows access to application-specific resources and classes
     */
    public TextView(Context context) {
        super(context);
        init(context, null);
    }

    /**
     * @param context allows access to application-specific resources and classes
     * @param attrs   collection of attributes
     *
     */
    private void init(Context context, AttributeSet attrs) {
        if (isInEditMode()) {
            return;
        }
    }

    /**
     * @param context allows access to application-specific resources and classes
     * @param attrs   collection of attributes
     * @see #init(Context context,AttributeSet attrs)
     */
    public TextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    /**
     * @param context allows access to application-specific resources and classes
     * @param attrs   collection of attributes
     * @param defStyle   contains a reference to a style resource that supplies defaults values for the StyledAttributes.
     * @see #init(Context context,AttributeSet attrs)
     */
    public TextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }
}
