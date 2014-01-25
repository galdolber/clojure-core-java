package clojure;

import clojure.lang.*;

public final class core_validate_fields extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Symbol const__2;
 public static final clojure.lang.IPersistentSet const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "__extmap");
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "__meta");
  const__3 = (clojure.lang.IPersistentSet)PersistentHashSet.create(Symbol.intern(null, "__extmap"), Symbol.intern(null, "__meta"));
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_validate_fields() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object fields1) {
  Object __r3737 = ((IFn)const__0.getRawRoot()).invoke(fields1);
  if (__r3737 != null && !(__r3737 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.AssertionError(((java.lang.Object)"No fields vector given.")));
  }
  {
   Object specials2 = const__3;
   Object __r3739 = ((IFn)const__4.getRawRoot()).invoke(specials2, fields1);
   if (__r3739 != null && !(__r3739 == Boolean.FALSE)) {
    Util.trow((Throwable)new java.lang.AssertionError(((java.lang.Object)((IFn)const__5.getRawRoot()).invoke("The names in ", specials2, " cannot be used as field names for types or records."))));
    return null;
   } else {
    return null;
   }
  }
 }
}
