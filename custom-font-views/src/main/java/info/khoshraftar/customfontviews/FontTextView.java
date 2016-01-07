package info.khoshraftar.customfontviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by hosein on 1/7/2016.
 */
public class FontTextView extends TextView
{

    public FontTextView(Context context)
    {
        super(context);
    }

    public FontTextView(Context context, AttributeSet attrs)
    {
        super(context, attrs);

        if(!isInEditMode())
        {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomFont, 0, 0);
            String fontFace = a.getString(R.styleable.CustomFont_fontname);
            Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/" + fontFace + ".ttf");
            setTypeface(font);
            a.recycle();
        }
    }
}
