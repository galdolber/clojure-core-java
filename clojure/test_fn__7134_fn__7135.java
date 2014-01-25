package clojure;

import clojure.lang.*;

public final class test_fn__7134_fn__7135 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "always-fail");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "default");
 }
 public test_fn__7134_fn__7135() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object msg1, java.lang.Object form2) {
  if (clojure.lang.Util.identical(((java.lang.Object)form2), ((java.lang.Object)null))) {
   return const__1;
  } else {
   Object __r4696 = ((IFn)const__2.getRawRoot()).invoke(form2);
   if (__r4696 != null && !(__r4696 == Boolean.FALSE)) {
    return ((IFn)const__3.getRawRoot()).invoke(form2);
   } else {
    Object __r4698 = const__4;
    if (__r4698 != null && !(__r4698 == Boolean.FALSE)) {
     return const__5;
    } else {
     return null;
    }
   }
  }
 }
}
