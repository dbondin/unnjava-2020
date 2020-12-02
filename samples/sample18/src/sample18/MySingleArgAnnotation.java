package sample18;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited()
@MyMarkerAnnotation
@Retention(RetentionPolicy.RUNTIME)
public @interface MySingleArgAnnotation {
	MySingleEnum value();
}
