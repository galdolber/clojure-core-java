package clojure;

import clojure.lang.*;

public final class core_most_specific_fn__5171 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "every?");
 }
 Object rtypes1;
 public core_most_specific_fn__5171(final Object rtypes1) {
  super();
  this.rtypes1 = rtypes1;
 }
 public java.lang.Object invoke(java.lang.Object t1) {
  Object __r3305 = ((IFn)const__0.getRawRoot()).invoke(new clojure.core_most_specific_fn__5171_fn__5172(t1), this.rtypes1);
  if (__r3305 != null && !(__r3305 == Boolean.FALSE)) {
   return t1;
  } else {
   return null;
  }
 }
}
