package clojure;

import clojure.lang.*;

public final class core_the_class extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.IPersistentSet const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "class?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "prim->class");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__6 = (java.lang.Object)Character.valueOf((char)46);
  const__7 = (java.lang.Object)Character.valueOf((char)91);
  const__8 = (clojure.lang.IPersistentSet)PersistentHashSet.create(Character.valueOf((char)46), Character.valueOf((char)91));
 }
 public core_the_class() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  Object __r3530 = ((IFn)const__0.getRawRoot()).invoke(x1);
  if (__r3530 != null && !(__r3530 == Boolean.FALSE)) {
   return x1;
  } else {
   Object __r3532 = ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), x1);
   if (__r3532 != null && !(__r3532 == Boolean.FALSE)) {
    return ((IFn)const__2.getRawRoot()).invoke(x1);
   } else {
    Object __r3534 = const__3;
    if (__r3534 != null && !(__r3534 == Boolean.FALSE)) {
     {
      Object strx2 = ((IFn)const__4.getRawRoot()).invoke(x1);
      Object __r3535;
      Object __r3536 = ((IFn)const__5.getRawRoot()).invoke(const__8, strx2);
      if (__r3536 != null && !(__r3536 == Boolean.FALSE)) {
       __r3535 = strx2;
      } else {
       __r3535 = ((IFn)const__4.getRawRoot()).invoke("java.lang.", strx2);
      }
      return ((java.lang.Class)clojure.lang.RT.classForName((java.lang.String)((java.lang.String)__r3535)));
     }
    } else {
     return null;
    }
   }
  }
 }
}
