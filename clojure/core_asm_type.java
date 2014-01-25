package clojure;

import clojure.lang.*;

public final class core_asm_type extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.IPersistentSet const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)java.lang.Class.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "prim->class");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "the-class");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__6 = (java.lang.Object)Character.valueOf((char)46);
  const__7 = (java.lang.Object)Character.valueOf((char)91);
  const__8 = (clojure.lang.IPersistentSet)PersistentHashSet.create(Character.valueOf((char)46), Character.valueOf((char)91));
 }
 public core_asm_type() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1) {
  Object __r3672 = null;
  {
   boolean or__3968__auto__2 = (c1 instanceof java.lang.Class);
   Object __r3673;
   if (or__3968__auto__2) {
    __r3673 = (or__3968__auto__2 ? Boolean.TRUE : Boolean.FALSE);
   } else {
    __r3673 = ((IFn)const__2.getRawRoot()).invoke(c1);
   }
   __r3672 = __r3673;
  }
  Object __r3674 = __r3672;
  if (__r3674 != null && !(__r3674 == Boolean.FALSE)) {
   return ((clojure.asm.Type)clojure.asm.Type.getType((java.lang.Class)((java.lang.Class)((IFn)const__3.getRawRoot()).invoke(c1))));
  } else {
   {
    Object strx3 = ((IFn)const__4.getRawRoot()).invoke(c1);
    Object __r3675;
    Object __r3676 = ((IFn)const__5.getRawRoot()).invoke(const__8, strx3);
    if (__r3676 != null && !(__r3676 == Boolean.FALSE)) {
     __r3675 = strx3;
    } else {
     __r3675 = ((IFn)const__4.getRawRoot()).invoke("java.lang.", strx3);
    }
    return ((clojure.asm.Type)clojure.asm.Type.getObjectType((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.String)__r3675).replace((java.lang.CharSequence)((java.lang.CharSequence)"."), (java.lang.CharSequence)((java.lang.CharSequence)"/"))))));
   }
  }
 }
}
