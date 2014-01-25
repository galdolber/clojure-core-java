package clojure;

import clojure.lang.*;

public final class core_ref extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "setup-reference");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "ref");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "max-history");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "min-history");
 }
 public core_ref() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object options2) {
  {
   Object r3 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(x1), options2);
   Object opts4 = ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), options2);
   Object __r2446 = RT.get(opts4, Keyword.intern(null, "max-history"));
   if (__r2446 != null && !(__r2446 == Boolean.FALSE)) {
    ((clojure.lang.Ref)r3).setMaxHistory((int)RT.intCast(RT.get(opts4, Keyword.intern(null, "max-history"))));
   } else {
   }
   Object __r2448 = RT.get(opts4, Keyword.intern(null, "min-history"));
   if (__r2448 != null && !(__r2448 == Boolean.FALSE)) {
    ((clojure.lang.Ref)r3).setMinHistory((int)RT.intCast(RT.get(opts4, Keyword.intern(null, "min-history"))));
   } else {
   }
   return r3;
  }
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return new clojure.lang.Ref(((java.lang.Object)x1));
 }
 public int getRequiredArity() {
  return 1;
 }
}
