package clojure;

import clojure.lang.*;

public final class pprint_set_indent extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "current");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "block");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-indent");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "n");
 }
 public pprint_set_indent() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object __r5638;
   Object __r5639 = RT.get(params1, Keyword.intern(null, "colon"));
   if (__r5639 != null && !(__r5639 == Boolean.FALSE)) {
    __r5638 = const__1;
   } else {
    __r5638 = const__2;
   }
   Object relative_to4 = __r5638;
   ((IFn)const__3.getRawRoot()).invoke(relative_to4, RT.get(params1, Keyword.intern(null, "n")));
   return navigator2;
  }
 }
}
