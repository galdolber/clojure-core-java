package clojure;

import clojure.lang.*;

public final class core_setup_reference extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "meta");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "validator");
 }
 public core_setup_reference() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object r1, java.lang.Object options2) {
  {
   Object opts3 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), options2);
   Object __r2430 = RT.get(opts3, Keyword.intern(null, "meta"));
   if (__r2430 != null && !(__r2430 == Boolean.FALSE)) {
    ((clojure.lang.AReference)r1).resetMeta((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)RT.get(opts3, Keyword.intern(null, "meta"))));
   } else {
   }
   Object __r2432 = RT.get(opts3, Keyword.intern(null, "validator"));
   if (__r2432 != null && !(__r2432 == Boolean.FALSE)) {
    ((clojure.lang.ARef)r1).setValidator((clojure.lang.IFn)((clojure.lang.IFn)RT.get(opts3, Keyword.intern(null, "validator"))));
   } else {
   }
   return r1;
  }
 }
}
