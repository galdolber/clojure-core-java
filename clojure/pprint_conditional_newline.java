package clojure;

import clojure.lang.*;

public final class pprint_conditional_newline extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "mandatory");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "fill");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "miser");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "linear");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-newline");
 }
 public pprint_conditional_newline() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object __r5640;
   Object __r5641 = RT.get(params1, Keyword.intern(null, "colon"));
   if (__r5641 != null && !(__r5641 == Boolean.FALSE)) {
    Object __r5642;
    Object __r5643 = RT.get(params1, Keyword.intern(null, "at"));
    if (__r5643 != null && !(__r5643 == Boolean.FALSE)) {
     __r5642 = const__2;
    } else {
     __r5642 = const__3;
    }
    __r5640 = __r5642;
   } else {
    Object __r5644;
    Object __r5645 = RT.get(params1, Keyword.intern(null, "at"));
    if (__r5645 != null && !(__r5645 == Boolean.FALSE)) {
     __r5644 = const__4;
    } else {
     __r5644 = const__5;
    }
    __r5640 = __r5644;
   }
   Object kind4 = __r5640;
   ((IFn)const__6.getRawRoot()).invoke(kind4);
   return navigator2;
  }
 }
}
