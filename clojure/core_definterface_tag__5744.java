package clojure;

import clojure.lang.*;

public final class core_definterface_tag__5744 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__2 = (java.lang.Object)java.lang.Object.class;
 }
 public core_definterface_tag__5744() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  {
   Object or__3968__auto__2 = RT.get(((IFn)const__1.getRawRoot()).invoke(x1), Keyword.intern(null, "tag"));
   Object __r3703 = or__3968__auto__2;
   if (__r3703 != null && !(__r3703 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    return const__2;
   }
  }
 }
}
