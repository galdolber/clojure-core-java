package clojure;

import clojure.lang.*;

public final class pprint_process_nesting_fn__8188 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "bracket-info");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "def");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "right");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "process-bracket");
 }
 public pprint_process_nesting_fn__8188() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object remainder1) {
  {
   Object this2 = ((IFn)const__0.getRawRoot()).invoke(remainder1);
   Object remainder3 = ((IFn)const__1.getRawRoot()).invoke(remainder1);
   Object bracket4 = RT.get(RT.get(this2, Keyword.intern(null, "def")), Keyword.intern(null, "bracket-info"));
   Object __r5858 = RT.get(bracket4, Keyword.intern(null, "right"));
   if (__r5858 != null && !(__r5858 == Boolean.FALSE)) {
    return ((IFn)const__5.getRawRoot()).invoke(this2, remainder3);
   } else {
    return RT.vector(this2, remainder3);
   }
  }
 }
}
