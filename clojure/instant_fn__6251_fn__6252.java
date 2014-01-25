package clojure;

import clojure.lang.*;

public final class instant_fn__6251_fn__6252 extends clojure.lang.AFunction {
 static {
 }
 Object dim_leap2;
 Object dim_norm1;
 public instant_fn__6251_fn__6252(final Object dim_leap2, final Object dim_norm1) {
  super();
  this.dim_leap2 = dim_leap2;
  this.dim_norm1 = dim_norm1;
 }
 public java.lang.Object invoke(java.lang.Object month1, java.lang.Object leap_year_QMARK_2) {
  Object __r4052;
  Object __r4053 = leap_year_QMARK_2;
  if (__r4053 != null && !(__r4053 == Boolean.FALSE)) {
   __r4052 = this.dim_leap2;
  } else {
   __r4052 = this.dim_norm1;
  }
  return ((IFn)__r4052).invoke(month1);
 }
}
