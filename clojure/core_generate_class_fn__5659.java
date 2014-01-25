package clojure;

import clojure.lang.*;

public final class core_generate_class_fn__5659 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "method-sig");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 Object emit_forwarding_method59;
 Object emit_unsupported58;
 public core_generate_class_fn__5659(final Object emit_forwarding_method59, final Object emit_unsupported58) {
  super();
  this.emit_forwarding_method59 = emit_forwarding_method59;
  this.emit_unsupported58 = emit_unsupported58;
 }
 public java.lang.Object invoke(java.lang.Object mm1, java.lang.Object meth2) {
  Object __r3564 = ((IFn)const__0.getRawRoot()).invoke(mm1, ((IFn)const__1.getRawRoot()).invoke(meth2));
  if (__r3564 != null && !(__r3564 == Boolean.FALSE)) {
   return mm1;
  } else {
   ((IFn)this.emit_forwarding_method59).invoke(((java.lang.String)((java.lang.reflect.Method)meth2).getName()), ((java.lang.Class[])((java.lang.reflect.Method)meth2).getParameterTypes()), ((java.lang.Class)((java.lang.reflect.Method)meth2).getReturnType()), ((java.lang.Class[])((java.lang.reflect.Method)meth2).getExceptionTypes()), Boolean.FALSE, this.emit_unsupported58);
   return ((IFn)const__2.getRawRoot()).invoke(mm1, ((IFn)const__1.getRawRoot()).invoke(meth2), meth2);
  }
 }
}
