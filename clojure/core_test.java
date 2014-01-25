package clojure;

import clojure.lang.*;

public final class core_test extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "test");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "ok");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "no-test");
 }
 public core_test() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object v1) {
  {
   Object f2 = RT.get(((IFn)const__1.getRawRoot()).invoke(v1), Keyword.intern(null, "test"));
   Object __r2897 = f2;
   if (__r2897 != null && !(__r2897 == Boolean.FALSE)) {
    ((IFn)f2).invoke();
    return const__2;
   } else {
    return const__3;
   }
  }
 }
}
