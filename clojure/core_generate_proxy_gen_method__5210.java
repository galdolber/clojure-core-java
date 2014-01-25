package clojure;

import clojure.lang.*;

public final class core_generate_proxy_gen_method__5210 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 public static final java.lang.Object const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__9 = (java.lang.Object)18L;
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__11 = (java.lang.Object)0L;
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "into-array");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "replicate");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "=");
 }
 Object cv3;
 Object imap_type17;
 Object obj_type19;
 Object ctype8;
 Object totype14;
 Object fmap13;
 Object rt_type21;
 Object ifn_type18;
 Object to_types15;
 public core_generate_proxy_gen_method__5210(final Object cv3, final Object imap_type17, final Object obj_type19, final Object ctype8, final Object totype14, final Object fmap13, final Object rt_type21, final Object ifn_type18, final Object to_types15) {
  super();
  this.cv3 = cv3;
  this.imap_type17 = imap_type17;
  this.obj_type19 = obj_type19;
  this.ctype8 = ctype8;
  this.totype14 = totype14;
  this.fmap13 = fmap13;
  this.rt_type21 = rt_type21;
  this.ifn_type18 = ifn_type18;
  this.to_types15 = to_types15;
 }
 public java.lang.Object invoke(java.lang.Object meth1, java.lang.Object else_gen2) {
  {
   Object pclasses3 = ((java.lang.Class[])((java.lang.reflect.Method)meth1).getParameterTypes());
   boolean abstract_QMARK_4 = java.lang.reflect.Modifier.isAbstract((int)((java.lang.reflect.Method)meth1).getModifiers());
   Object ptypes5 = ((IFn)this.to_types15).invoke(pclasses3);
   Object rclass6 = ((java.lang.Class)((java.lang.reflect.Method)meth1).getReturnType());
   Object extypes7 = ((java.lang.Class[])((java.lang.reflect.Method)meth1).getExceptionTypes());
   Object exdecl8 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(", ", ((IFn)const__3.getRawRoot()).invoke(new clojure.core_generate_proxy_gen_method__5210_fn__5211(), extypes7)));
   Object rcanonical9 = ((java.lang.String)((java.lang.Class)rclass6).getCanonicalName());
   Object rtype10 = ((IFn)this.totype14).invoke(rclass6);
   Object mname11 = ((java.lang.String)((java.lang.reflect.Method)meth1).getName());
   Object m12 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)mname11), (clojure.asm.Type)((clojure.asm.Type)rtype10), (clojure.asm.Type[])((clojure.asm.Type[])ptypes5));
   Object gen13 = new clojure.asm.commons.GeneratorAdapter((int)clojure.asm.Opcodes.ACC_PUBLIC, (clojure.asm.commons.Method)((clojure.asm.commons.Method)m12), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)this.cv3));
   Object else_label14 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen13).newLabel());
   Object end_label15 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen13).newLabel());
   Object decl_type16 = ((clojure.asm.Type)clojure.asm.Type.getType((java.lang.Class)((java.lang.Class)((java.lang.Class)((java.lang.reflect.Method)meth1).getDeclaringClass()))));
   ((clojure.asm.MethodAdapter)gen13).visitCode();
   Object __r3311;
   Object __r3312 = ((IFn)const__7.getRawRoot()).invoke(exdecl8);
   if (__r3312 != null && !(__r3312 == Boolean.FALSE)) {
    __r3311 = "";
   } else {
    __r3311 = ((IFn)const__1.getRawRoot()).invoke(" throws ", exdecl8, " ");
   }
   clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke("public ", ((java.lang.String)((java.lang.Class)rclass6).getCanonicalName()), " ", mname11, "(", ((IFn)const__4.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(", ", ((IFn)const__3.getRawRoot()).invoke(new clojure.core_generate_proxy_gen_method__5210_fn__5213(pclasses3), ((IFn)const__5.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses3))))))), ")", __r3311, " {")));
   clojure.lang.Compiler.tab();
   if (clojure.lang.Numbers.gt((long)clojure.lang.RT.count(((java.lang.Object)pclasses3)), (long)18L)) {
    ((IFn)else_gen2).invoke(gen13, m12);
   } else {
    ((clojure.asm.commons.GeneratorAdapter)gen13).loadThis();
    ((clojure.asm.commons.GeneratorAdapter)gen13).getField((clojure.asm.Type)((clojure.asm.Type)this.ctype8), (java.lang.String)((java.lang.String)this.fmap13), (clojure.asm.Type)((clojure.asm.Type)this.imap_type17));
    ((clojure.asm.commons.GeneratorAdapter)gen13).push((java.lang.String)((java.lang.String)mname11));
    clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke("final Object value = RT.get(this.__clojureFnMap, \"", mname11, "\");")));
    ((clojure.asm.commons.GeneratorAdapter)gen13).invokeStatic((clojure.asm.Type)((clojure.asm.Type)this.rt_type21), (clojure.asm.commons.Method)((clojure.asm.commons.Method)((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"Object get(Object, Object)")))));
    ((clojure.asm.commons.GeneratorAdapter)gen13).dup();
    ((clojure.asm.commons.GeneratorAdapter)gen13).ifNull((clojure.asm.Label)((clojure.asm.Label)else_label14));
    ((clojure.asm.commons.GeneratorAdapter)gen13).checkCast((clojure.asm.Type)((clojure.asm.Type)this.ifn_type18));
    ((clojure.asm.commons.GeneratorAdapter)gen13).loadThis();
    {
     long n__4366__auto__17 = clojure.lang.RT.longCast((int)clojure.lang.RT.count(((java.lang.Object)ptypes5)));
     {
      long i18 = 0L;
      while(true) {
       if (clojure.lang.Numbers.lt((long)i18, (long)n__4366__auto__17)) {
        ((clojure.asm.commons.GeneratorAdapter)gen13).loadArg((int)RT.intCast(i18));
        clojure.lang.Compiler.HostExpr.emitBoxReturn((clojure.lang.Compiler.ObjExpr)((clojure.lang.Compiler.ObjExpr)null), (clojure.asm.commons.GeneratorAdapter)((clojure.asm.commons.GeneratorAdapter)gen13), (java.lang.Class)((java.lang.Class)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)pclasses3), (int)RT.intCast(i18)))), (java.lang.String)((java.lang.String)""));
        long i18___aux = clojure.lang.Numbers.unchecked_inc((long)i18);
        i18 = i18___aux;
        continue;
       } else {
       }
       break;
      }
     }
    }
    ((clojure.asm.commons.GeneratorAdapter)gen13).invokeInterface((clojure.asm.Type)((clojure.asm.Type)this.ifn_type18), (clojure.asm.commons.Method)((clojure.asm.commons.Method)new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"invoke"), (clojure.asm.Type)((clojure.asm.Type)this.obj_type19), (clojure.asm.Type[])((clojure.asm.Type[])((IFn)const__15.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(this.obj_type19, ((IFn)const__17.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)ptypes5))), this.obj_type19)))))));
    {
     Object param_list19 = ((IFn)const__4.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(", ", ((IFn)const__3.getRawRoot()).invoke(new clojure.core_generate_proxy_gen_method__5210_fn__5215(), ((IFn)const__5.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses3)))))));
     if (clojure.lang.Util.equiv(((java.lang.Object)rcanonical9), ((java.lang.Object)"void"))) {
      Object __r3316;
      Object __r3317 = ((IFn)const__7.getRawRoot()).invoke(param_list19);
      if (__r3317 != null && !(__r3317 == Boolean.FALSE)) {
       __r3316 = "";
      } else {
       __r3316 = ", ";
      }
      Object __r3318;
      if (abstract_QMARK_4) {
       __r3318 = "";
      } else {
       __r3318 = ((IFn)const__1.getRawRoot()).invoke("else { super.", mname11, "(", param_list19, "); }");
      }
      clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke("if (value != null) {", "((IFn)value).invoke(this", __r3316, param_list19, "); } ", __r3318)));
     } else {
      Object __r3319;
      Object __r3320 = ((IFn)const__7.getRawRoot()).invoke(param_list19);
      if (__r3320 != null && !(__r3320 == Boolean.FALSE)) {
       __r3319 = "";
      } else {
       __r3319 = ", ";
      }
      Object __r3321;
      if (abstract_QMARK_4) {
       __r3321 = "null;";
      } else {
       __r3321 = ((IFn)const__1.getRawRoot()).invoke("super.", mname11, "(", param_list19, ");");
      }
      clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke("return (value != null) ? ", "(", rcanonical9, ")", ((java.lang.String)((clojure.asm.commons.GeneratorAdapter)gen13).unbox((clojure.asm.Type)((clojure.asm.Type)rtype10), (java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke("((IFn)value).invoke(this", __r3319, param_list19, ")")))), " : ", __r3321)));
     }
    }
    ((clojure.asm.commons.GeneratorAdapter)gen13).unbox((clojure.asm.Type)((clojure.asm.Type)rtype10));
    if (clojure.lang.Util.equiv((long)((clojure.asm.Type)rtype10).getSort(), (long)clojure.asm.Type.VOID)) {
     ((clojure.asm.commons.GeneratorAdapter)gen13).pop();
    } else {
    }
    ((clojure.asm.commons.GeneratorAdapter)gen13).goTo((clojure.asm.Label)((clojure.asm.Label)end_label15));
    clojure.lang.Var.pushThreadBindings((clojure.lang.Associative)((clojure.lang.Associative)RT.mapUniqueKeys(((clojure.lang.Var)clojure.lang.Compiler.STOP_EMIT_SOURCE), Boolean.TRUE)));
    ((clojure.asm.commons.GeneratorAdapter)gen13).mark((clojure.asm.Label)((clojure.asm.Label)else_label14));
    ((clojure.asm.commons.GeneratorAdapter)gen13).pop();
    ((IFn)else_gen2).invoke(gen13, m12);
    clojure.lang.Var.popThreadBindings();
    ((clojure.asm.commons.GeneratorAdapter)gen13).mark((clojure.asm.Label)((clojure.asm.Label)end_label15));
   }
   clojure.lang.Compiler.untab();
   clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
   ((clojure.asm.commons.GeneratorAdapter)gen13).returnValue();
   ((clojure.asm.commons.GeneratorAdapter)gen13).endMethod();
   return null;
  }
 }
}
