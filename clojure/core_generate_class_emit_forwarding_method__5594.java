package clojure;

import clojure.lang.*;

public final class core_generate_class_emit_forwarding_method__5594 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final java.lang.Object const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final java.lang.Object const__22;
 public static final java.lang.Object const__23;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "the-class");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__6 = (java.lang.Object)0L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "add-annotations");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__19 = (java.lang.Object)18L;
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "overload-name");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "replicate");
  const__22 = (java.lang.Object)1L;
  const__23 = (java.lang.Object)java.lang.Object.class;
 }
 Object ifn_type50;
 Object totype36;
 Object to_types37;
 Object emit_get_var57;
 Object cv29;
 Object obj_type38;
 Object overloads55;
 public core_generate_class_emit_forwarding_method__5594(final Object ifn_type50, final Object totype36, final Object to_types37, final Object emit_get_var57, final Object cv29, final Object obj_type38, final Object overloads55) {
  super();
  this.ifn_type50 = ifn_type50;
  this.totype36 = totype36;
  this.to_types37 = to_types37;
  this.emit_get_var57 = emit_get_var57;
  this.cv29 = cv29;
  this.obj_type38 = obj_type38;
  this.overloads55 = overloads55;
 }
 public java.lang.Object invoke(java.lang.Object name1, java.lang.Object pclasses2, java.lang.Object rclass3, java.lang.Object exclasses4, java.lang.Object as_static5, java.lang.Object else_gen6) {
  {
   Object mname7 = ((IFn)const__0.getRawRoot()).invoke(name1);
   Object pmetas8 = ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), pclasses2);
   Object pclasses9 = ((IFn)const__1.getRawRoot()).invoke(const__3.getRawRoot(), pclasses2);
   Object rclass10 = ((IFn)const__3.getRawRoot()).invoke(rclass3);
   Object ptypes11 = ((IFn)this.to_types37).invoke(pclasses9);
   Object rtype12 = ((IFn)this.totype36).invoke(rclass10);
   Object m13 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)mname7), (clojure.asm.Type)((clojure.asm.Type)rtype12), (clojure.asm.Type[])((clojure.asm.Type[])ptypes11));
   Object is_overload14 = ((IFn)const__4.getRawRoot()).invoke(((IFn)this.overloads55).invoke(mname7));
   Object __r3543;
   Object __r3544 = as_static5;
   if (__r3544 != null && !(__r3544 == Boolean.FALSE)) {
    __r3543 = Integer.valueOf(clojure.asm.Opcodes.ACC_STATIC);
   } else {
    __r3543 = const__6;
   }
   Object gen15 = new clojure.asm.commons.GeneratorAdapter((int)RT.intCast(((java.lang.Number)clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PUBLIC, ((java.lang.Object)__r3543)))), (clojure.asm.commons.Method)((clojure.asm.commons.Method)m13), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)this.cv29));
   Object found_label16 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen15).newLabel());
   Object else_label17 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen15).newLabel());
   Object end_label18 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen15).newLabel());
   boolean rvoid19 = clojure.lang.Util.equiv((long)((clojure.asm.Type)rtype12).getSort(), (long)clojure.asm.Type.VOID);
   ((IFn)const__8.getRawRoot()).invoke(gen15, ((IFn)const__2.getRawRoot()).invoke(name1));
   {
    long n__4366__auto__20 = clojure.lang.RT.longCast((int)clojure.lang.RT.count(((java.lang.Object)pmetas8)));
    {
     long i21 = 0L;
     while(true) {
      if (clojure.lang.Numbers.lt((long)i21, (long)n__4366__auto__20)) {
       ((IFn)const__8.getRawRoot()).invoke(gen15, ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)pmetas8), (int)RT.intCast(i21))), Numbers.num(i21));
       long i21___aux = clojure.lang.Numbers.unchecked_inc((long)i21);
       i21 = i21___aux;
       continue;
      } else {
      }
      break;
     }
    }
   }
   Object __r3546;
   Object __r3547 = as_static5;
   if (__r3547 != null && !(__r3547 == Boolean.FALSE)) {
    __r3546 = "static ";
   } else {
    __r3546 = "";
   }
   Object __r3548;
   Object __r3549 = ((IFn)const__17.getRawRoot()).invoke(exclasses4);
   if (__r3549 != null && !(__r3549 == Boolean.FALSE)) {
    __r3548 = "";
   } else {
    __r3548 = ((IFn)const__0.getRawRoot()).invoke(" throws ", ((IFn)const__14.getRawRoot()).invoke(const__0.getRawRoot(), ((IFn)const__15.getRawRoot()).invoke(", ", ((IFn)const__1.getRawRoot()).invoke(new clojure.core_generate_class_emit_forwarding_method__5594_fn__5597(), exclasses4))));
   }
   clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke("public ", __r3546, ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)rclass10))), " ", mname7, "(", ((IFn)const__14.getRawRoot()).invoke(const__0.getRawRoot(), ((IFn)const__15.getRawRoot()).invoke(", ", ((IFn)const__1.getRawRoot()).invoke(new clojure.core_generate_class_emit_forwarding_method__5594_fn__5595(pclasses9), ((IFn)const__16.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses9))))))), ")", __r3548, " {")));
   clojure.lang.Compiler.tab();
   ((clojure.asm.MethodAdapter)gen15).visitCode();
   clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"Object value = null;"));
   if (clojure.lang.Numbers.gt((long)clojure.lang.RT.count(((java.lang.Object)pclasses9)), (long)18L)) {
    ((IFn)else_gen6).invoke(gen15, m13);
   } else {
    Object __r3552 = is_overload14;
    if (__r3552 != null && !(__r3552 == Boolean.FALSE)) {
     ((IFn)this.emit_get_var57).invoke(gen15, ((IFn)const__20.getRawRoot()).invoke(mname7, pclasses9));
     ((clojure.asm.commons.GeneratorAdapter)gen15).dup();
     ((clojure.asm.commons.GeneratorAdapter)gen15).ifNonNull((clojure.asm.Label)((clojure.asm.Label)found_label16));
     ((clojure.asm.commons.GeneratorAdapter)gen15).pop();
    } else {
    }
    ((IFn)this.emit_get_var57).invoke(gen15, mname7);
    ((clojure.asm.commons.GeneratorAdapter)gen15).dup();
    clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke("if (value != null) {")));
    clojure.lang.Compiler.tab();
    ((clojure.asm.commons.GeneratorAdapter)gen15).ifNull((clojure.asm.Label)((clojure.asm.Label)else_label17));
    Object __r3554 = is_overload14;
    if (__r3554 != null && !(__r3554 == Boolean.FALSE)) {
     ((clojure.asm.commons.GeneratorAdapter)gen15).mark((clojure.asm.Label)((clojure.asm.Label)found_label16));
    } else {
    }
    ((clojure.asm.commons.GeneratorAdapter)gen15).checkCast((clojure.asm.Type)((clojure.asm.Type)this.ifn_type50));
    Object __r3556 = as_static5;
    if (__r3556 != null && !(__r3556 == Boolean.FALSE)) {
    } else {
     ((clojure.asm.commons.GeneratorAdapter)gen15).loadThis();
    }
    Object __r3557;
    if (rvoid19) {
     __r3557 = "";
    } else {
     __r3557 = "return ";
    }
    clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke(__r3557, ((java.lang.String)clojure.lang.Compiler.unboxVal((java.lang.Class)((java.lang.Class)rclass10), (java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke("((IFn)value).invoke(", ((IFn)const__14.getRawRoot()).invoke(const__0.getRawRoot(), ((IFn)const__15.getRawRoot()).invoke(", ", ((IFn)const__1.getRawRoot()).invoke(new clojure.core_generate_class_emit_forwarding_method__5594_fn__5599(pclasses9, gen15), ((IFn)const__16.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)ptypes11))))))), ")")))), ";")));
    Object __r3558;
    Object __r3559 = as_static5;
    if (__r3559 != null && !(__r3559 == Boolean.FALSE)) {
     __r3558 = 0L;
    } else {
     __r3558 = 1L;
    }
    ((clojure.asm.commons.GeneratorAdapter)gen15).invokeInterface((clojure.asm.Type)((clojure.asm.Type)this.ifn_type50), (clojure.asm.commons.Method)((clojure.asm.commons.Method)new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"invoke"), (clojure.asm.Type)((clojure.asm.Type)this.obj_type38), (clojure.asm.Type[])((clojure.asm.Type[])((IFn)this.to_types37).invoke(((IFn)const__21.getRawRoot()).invoke(Numbers.num(clojure.lang.Numbers.add((long)clojure.lang.RT.count(((java.lang.Object)ptypes11)), (long)(java.lang.Long)__r3558)), const__23))))));
    ((clojure.asm.commons.GeneratorAdapter)gen15).unbox((clojure.asm.Type)((clojure.asm.Type)rtype12));
    if (rvoid19) {
     ((clojure.asm.commons.GeneratorAdapter)gen15).pop();
    } else {
    }
    ((clojure.asm.commons.GeneratorAdapter)gen15).goTo((clojure.asm.Label)((clojure.asm.Label)end_label18));
    ((clojure.asm.commons.GeneratorAdapter)gen15).mark((clojure.asm.Label)((clojure.asm.Label)else_label17));
    ((clojure.asm.commons.GeneratorAdapter)gen15).pop();
    clojure.lang.Compiler.untab();
    clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"} else {"));
    clojure.lang.Compiler.tab();
    ((IFn)else_gen6).invoke(gen15, m13);
    clojure.lang.Compiler.untab();
    clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
    ((clojure.asm.commons.GeneratorAdapter)gen15).mark((clojure.asm.Label)((clojure.asm.Label)end_label18));
   }
   clojure.lang.Compiler.untab();
   clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
   ((clojure.asm.commons.GeneratorAdapter)gen15).returnValue();
   ((clojure.asm.commons.GeneratorAdapter)gen15).endMethod();
   return null;
  }
 }
}
