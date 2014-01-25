package clojure;

import clojure.lang.*;

public final class core_generate_class_emit_unsupported__5592 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 Object impl_pkg_name32;
 Object prefix11;
 Object ex_type52;
 public core_generate_class_emit_unsupported__5592(final Object impl_pkg_name32, final Object prefix11, final Object ex_type52) {
  super();
  this.impl_pkg_name32 = impl_pkg_name32;
  this.prefix11 = prefix11;
  this.ex_type52 = ex_type52;
 }
 public java.lang.Object invoke(java.lang.Object gen1, java.lang.Object m2) {
  {
   Object msg3 = ((IFn)const__0.getRawRoot()).invoke(((java.lang.String)((clojure.asm.commons.Method)m2).getName()), " (", this.impl_pkg_name32, "/", this.prefix11, ((java.lang.String)((clojure.asm.commons.Method)m2).getName()), " not defined?)");
   clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke("throw new ", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)this.ex_type52))), "(\"", msg3, "\");")));
   ((clojure.asm.commons.GeneratorAdapter)gen1).throwException((clojure.asm.Type)((clojure.asm.Type)this.ex_type52), (java.lang.String)((java.lang.String)msg3));
   return null;
  }
 }
}
