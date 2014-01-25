package clojure;

import clojure.lang.*;

public final class pprint_fn__8055_fn__8056 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "n");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "absolute-reposition");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "relative-reposition");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "-");
 }
 public pprint_fn__8055_fn__8056() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object n4 = RT.get(params1, Keyword.intern(null, "n"));
   Object __r5679 = RT.get(params1, Keyword.intern(null, "at"));
   if (__r5679 != null && !(__r5679 == Boolean.FALSE)) {
    return ((IFn)const__2.getRawRoot()).invoke(navigator2, n4);
   } else {
    Object __r5680;
    Object __r5681 = RT.get(params1, Keyword.intern(null, "colon"));
    if (__r5681 != null && !(__r5681 == Boolean.FALSE)) {
     __r5680 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)n4)));
    } else {
     __r5680 = n4;
    }
    return ((IFn)const__3.getRawRoot()).invoke(navigator2, __r5680);
   }
  }
 }
}
