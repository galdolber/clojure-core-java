package clojure;

import clojure.lang.*;

public final class core_generate_class_emit_get_var__5590 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 Object ctype34;
 Object var_name46;
 Object var_type49;
 public core_generate_class_emit_get_var__5590(final Object ctype34, final Object var_name46, final Object var_type49) {
  super();
  this.ctype34 = ctype34;
  this.var_name46 = var_name46;
  this.var_type49 = var_type49;
 }
 public java.lang.Object invoke(java.lang.Object gen1, java.lang.Object v2) {
  {
   Object false_label3 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen1).newLabel());
   Object end_label4 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen1).newLabel());
   ((clojure.asm.commons.GeneratorAdapter)gen1).getStatic((clojure.asm.Type)((clojure.asm.Type)this.ctype34), (java.lang.String)((java.lang.String)((IFn)this.var_name46).invoke(v2)), (clojure.asm.Type)((clojure.asm.Type)this.var_type49));
   ((clojure.asm.commons.GeneratorAdapter)gen1).dup();
   ((clojure.asm.commons.GeneratorAdapter)gen1).invokeVirtual((clojure.asm.Type)((clojure.asm.Type)this.var_type49), (clojure.asm.commons.Method)((clojure.asm.commons.Method)((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"boolean isBound()")))));
   ((clojure.asm.commons.GeneratorAdapter)gen1).ifZCmp((int)clojure.asm.commons.GeneratorAdapter.EQ, (clojure.asm.Label)((clojure.asm.Label)false_label3));
   ((clojure.asm.commons.GeneratorAdapter)gen1).invokeVirtual((clojure.asm.Type)((clojure.asm.Type)this.var_type49), (clojure.asm.commons.Method)((clojure.asm.commons.Method)((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"Object get()")))));
   ((clojure.asm.commons.GeneratorAdapter)gen1).goTo((clojure.asm.Label)((clojure.asm.Label)end_label4));
   ((clojure.asm.commons.GeneratorAdapter)gen1).mark((clojure.asm.Label)((clojure.asm.Label)false_label3));
   ((clojure.asm.commons.GeneratorAdapter)gen1).pop();
   ((clojure.asm.MethodAdapter)gen1).visitInsn((int)clojure.asm.Opcodes.ACONST_NULL);
   ((clojure.asm.commons.GeneratorAdapter)gen1).mark((clojure.asm.Label)((clojure.asm.Label)end_label4));
   clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"value = null;"));
   clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke("if (", ((IFn)this.var_name46).invoke(v2), ".isBound()) {")));
   clojure.lang.Compiler.tab();
   clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke("value = ", ((IFn)this.var_name46).invoke(v2), ".get();")));
   clojure.lang.Compiler.untab();
   clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
   return null;
  }
 }
}
