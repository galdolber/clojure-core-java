package clojure;

import clojure.lang.*;

public final class core_generate_class_fn__5651 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "the-class");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "count");
 }
 Object super_type40;
 Object totype36;
 Object meth139;
 public core_generate_class_fn__5651(final Object super_type40, final Object totype36, final Object meth139) {
  super();
  this.super_type40 = super_type40;
  this.totype36 = totype36;
  this.meth139 = meth139;
 }
 public java.lang.Object invoke(java.lang.Object gen1, java.lang.Object m2) {
  ((clojure.asm.commons.GeneratorAdapter)gen1).loadThis();
  ((clojure.asm.commons.GeneratorAdapter)gen1).loadArgs();
  ((clojure.asm.MethodAdapter)gen1).visitMethodInsn((int)clojure.asm.Opcodes.INVOKESPECIAL, (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.Type)this.super_type40).getInternalName())), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.commons.Method)m2).getName())), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.commons.Method)m2).getDescriptor())));
  {
   Object pclasses3 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((java.lang.Class[])((java.lang.reflect.Method)this.meth139).getParameterTypes()));
   Object rclass4 = ((IFn)const__1.getRawRoot()).invoke(((java.lang.Class)((java.lang.reflect.Method)this.meth139).getReturnType()));
   Object rtype5 = ((IFn)this.totype36).invoke(rclass4);
   boolean rvoid6 = clojure.lang.Util.equiv((long)((clojure.asm.Type)rtype5).getSort(), (long)clojure.asm.Type.VOID);
   Object __r3561;
   if (rvoid6) {
    __r3561 = "";
   } else {
    __r3561 = "return ";
   }
   clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__3.getRawRoot()).invoke(__r3561, "super.", ((java.lang.String)((clojure.asm.commons.Method)m2).getName()), "(", ((IFn)const__4.getRawRoot()).invoke(const__3.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(", ", ((IFn)const__0.getRawRoot()).invoke(new clojure.core_generate_class_fn__5651_fn__5652(), ((IFn)const__6.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses3))))))), ");")));
   return null;
  }
 }
}
