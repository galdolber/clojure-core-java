package clojure;

import clojure.lang.*;

public final class core_most_specific extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "some");
 }
 public core_most_specific() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object rtypes1) {
  {
   Object or__3968__auto__2 = ((IFn)const__0.getRawRoot()).invoke(new clojure.core_most_specific_fn__5171(rtypes1), rtypes1);
   Object __r3307 = or__3968__auto__2;
   if (__r3307 != null && !(__r3307 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)"Incompatible return types")));
    return null;
   }
  }
 }
}
