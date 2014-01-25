package clojure;

import clojure.lang.*;

public final class core_normalize_slurp_opts extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "encoding");
 }
 public core_normalize_slurp_opts() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object opts1) {
  Object __r4084 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(opts1));
  if (__r4084 != null && !(__r4084 == Boolean.FALSE)) {
   ((IFn)const__2.getRawRoot()).invoke("WARNING: (slurp f enc) is deprecated, use (slurp f :encoding enc).");
   return RT.vector(const__3, ((IFn)const__1.getRawRoot()).invoke(opts1));
  } else {
   return opts1;
  }
 }
}
