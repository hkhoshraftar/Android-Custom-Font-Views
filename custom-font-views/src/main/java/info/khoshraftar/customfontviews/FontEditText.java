package info.khoshraftar.customfontviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by hosein on 1/7/2016.
 */
public class FontEditText extends EditText {
    public FontEditText(Context context) {
        super(context);
    }

    public FontEditText(Context context, AttributeSet attrs) {
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
