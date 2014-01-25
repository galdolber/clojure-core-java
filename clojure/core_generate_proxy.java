package clojure;

import clojure.lang.*;

public final class core_generate_proxy extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final java.lang.Object const__9;
 public static final java.lang.Object const__10;
 public static final java.lang.Object const__11;
 public static final java.lang.Object const__12;
 public static final java.lang.Object const__13;
 public static final java.lang.Object const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final java.lang.Object const__22;
 public static final clojure.lang.Var const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.Var const__25;
 public static final clojure.lang.Var const__26;
 public static final clojure.lang.Var const__27;
 public static final clojure.lang.Var const__28;
 public static final clojure.lang.Var const__29;
 public static final clojure.lang.Var const__30;
 public static final clojure.lang.Var const__31;
 public static final clojure.lang.Var const__32;
 public static final clojure.lang.Var const__33;
 public static final java.lang.Object const__34;
 public static final clojure.lang.Var const__35;
 public static final java.lang.Object const__36;
 public static final clojure.lang.Var const__37;
 public static final clojure.lang.Var const__38;
 public static final clojure.lang.Var const__39;
 public static final clojure.lang.Var const__40;
 public static final clojure.lang.Var const__41;
 public static final clojure.lang.Var const__42;
 public static final clojure.lang.Var const__43;
 public static final clojure.lang.Var const__44;
 public static final clojure.lang.Var const__45;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*source-writer*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "proxy-name");
  const__4 = (java.lang.Object)Character.valueOf((char)46);
  const__5 = (java.lang.Object)Character.valueOf((char)47);
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__8 = (java.lang.Object)0L;
  const__9 = (java.lang.Object)clojure.lang.IPersistentMap.class;
  const__10 = (java.lang.Object)clojure.lang.IFn.class;
  const__11 = (java.lang.Object)java.lang.Object.class;
  const__12 = (java.lang.Object)clojure.lang.Symbol.class;
  const__13 = (java.lang.Object)clojure.lang.RT.class;
  const__14 = (java.lang.Object)java.lang.UnsupportedOperationException.class;
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "into-array");
  const__22 = (java.lang.Object)clojure.lang.IProxy.class;
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__28 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__29 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__31 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__32 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__33 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__34 = (java.lang.Object)clojure.lang.IPersistentCollection.class;
  const__35 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__36 = (java.lang.Object)1L;
  const__37 = (clojure.lang.Var)RT.var("clojure.core", "into1");
  const__38 = (clojure.lang.Var)RT.var("clojure.core", "group-by-sig");
  const__39 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__40 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__41 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__42 = (clojure.lang.Var)RT.var("clojure.core", "remove");
  const__43 = (clojure.lang.Var)RT.var("clojure.core", "vals");
  const__44 = (clojure.lang.Var)RT.var("clojure.core", "*compile-files*");
  const__45 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public core_generate_proxy() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object super1, java.lang.Object interfaces2) {
  try {
   {
    Object cv3 = new clojure.asm.ClassWriter((int)clojure.asm.ClassWriter.COMPUTE_MAXS);
    {
     ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, ((clojure.lang.SourceWriter)((clojure.asm.ClassWriter)cv3).getSc())));
     try {
      {
       Object sname6 = ((IFn)const__3.getRawRoot()).invoke(super1, interfaces2);
       Object cname7 = ((java.lang.String)((java.lang.String)sname6).replace((char)((Character)const__4).charValue(), (char)((Character)const__5).charValue()));
       Object ctype8 = ((clojure.asm.Type)clojure.asm.Type.getObjectType((java.lang.String)((java.lang.String)cname7)));
       int lastdot9 = ((java.lang.String)sname6).lastIndexOf((java.lang.String)((java.lang.String)"."));
       Object classname10 = ((IFn)const__6.getRawRoot()).invoke(sname6, Numbers.num(clojure.lang.Numbers.inc((long)lastdot9)));
       Object packagename11 = ((IFn)const__6.getRawRoot()).invoke(sname6, const__8, Integer.valueOf(lastdot9));
       Object iname12 = new clojure.core_generate_proxy_iname__5201();
       Object fmap13 = "__clojureFnMap";
       Object totype14 = new clojure.core_generate_proxy_totype__5203();
       Object to_types15 = new clojure.core_generate_proxy_to_types__5205(totype14);
       Object super_type16 = ((IFn)totype14).invoke(super1);
       Object imap_type17 = ((IFn)totype14).invoke(const__9);
       Object ifn_type18 = ((IFn)totype14).invoke(const__10);
       Object obj_type19 = ((IFn)totype14).invoke(const__11);
       Object sym_type20 = ((IFn)totype14).invoke(const__12);
       Object rt_type21 = ((IFn)totype14).invoke(const__13);
       Object ex_type22 = ((IFn)totype14).invoke(const__14);
       Object gen_bridge23 = new clojure.core_generate_proxy_gen_bridge__5207(cv3, totype14, to_types15);
       Object gen_method24 = new clojure.core_generate_proxy_gen_method__5210(cv3, imap_type17, obj_type19, ctype8, totype14, fmap13, rt_type21, ifn_type18, to_types15);
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke("package ", packagename11, ";")));
       clojure.lang.Compiler.emitSource();
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"import java.util.*;"));
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"import clojure.lang.*;"));
       clojure.lang.Compiler.emitSource();
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke("public class ", classname10, " extends ", ((java.lang.String)((java.lang.Class)super1).getCanonicalName()), " implements ", ((IFn)const__16.getRawRoot()).invoke(const__15.getRawRoot(), ((IFn)const__17.getRawRoot()).invoke(", ", ((IFn)const__18.getRawRoot()).invoke("IProxy", ((IFn)const__19.getRawRoot()).invoke(new clojure.core_generate_proxy_fn__5219(), interfaces2)))), " {")));
       clojure.lang.Compiler.tab();
       clojure.lang.Compiler.emitSource();
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"private volatile IPersistentMap __clojureFnMap;"));
       clojure.lang.Compiler.emitSource();
       ((clojure.asm.ClassWriter)cv3).visit((int)clojure.asm.Opcodes.V1_5, (int)RT.intCast(clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PUBLIC, (long)clojure.asm.Opcodes.ACC_SUPER)), (java.lang.String)((java.lang.String)cname7), (java.lang.String)((java.lang.String)null), (java.lang.String)((java.lang.String)((IFn)iname12).invoke(super1)), (java.lang.String[])((java.lang.String[])((IFn)const__21.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(iname12, ((IFn)const__18.getRawRoot()).invoke(const__22, interfaces2)))));
       ((clojure.asm.ClassWriter)cv3).visitField((int)RT.intCast(clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PRIVATE, (long)clojure.asm.Opcodes.ACC_VOLATILE)), (java.lang.String)((java.lang.String)fmap13), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.Type)imap_type17).getDescriptor())), (java.lang.String)((java.lang.String)null), ((java.lang.Object)null));
       {
        Object seq_522125 = ((IFn)const__23.getRawRoot()).invoke(((java.lang.reflect.Constructor[])((java.lang.Class)super1).getDeclaredConstructors()));
        Object chunk_522226 = null;
        long count_522327 = 0L;
        long i_522428 = 0L;
        while(true) {
         if (clojure.lang.Numbers.lt((long)i_522428, (long)count_522327)) {
          {
           Object ctor29 = ((java.lang.Object)((clojure.lang.Indexed)chunk_522226).nth((int)RT.intCast(i_522428)));
           if (java.lang.reflect.Modifier.isPrivate((int)((java.lang.reflect.Constructor)ctor29).getModifiers())) {
           } else {
            {
             Object pclasses30 = ((java.lang.Class[])((java.lang.reflect.Constructor)ctor29).getParameterTypes());
             Object ptypes31 = ((IFn)to_types15).invoke(pclasses30);
             Object m32 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"<init>"), (clojure.asm.Type)((clojure.asm.Type)((clojure.asm.Type)clojure.asm.Type.VOID_TYPE)), (clojure.asm.Type[])((clojure.asm.Type[])ptypes31));
             Object gen33 = new clojure.asm.commons.GeneratorAdapter((int)clojure.asm.Opcodes.ACC_PUBLIC, (clojure.asm.commons.Method)((clojure.asm.commons.Method)m32), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv3));
             ((clojure.asm.MethodAdapter)gen33).visitCode();
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke("public ", classname10, "(", ((IFn)const__16.getRawRoot()).invoke(const__15.getRawRoot(), ((IFn)const__17.getRawRoot()).invoke(", ", ((IFn)const__19.getRawRoot()).invoke(new clojure.core_generate_proxy_fn__5225(pclasses30), ((IFn)const__25.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses30))))))), ") {")));
             clojure.lang.Compiler.tab();
             ((clojure.asm.commons.GeneratorAdapter)gen33).loadThis();
             ((clojure.asm.commons.GeneratorAdapter)gen33).dup();
             ((clojure.asm.commons.GeneratorAdapter)gen33).loadArgs();
             ((clojure.asm.commons.GeneratorAdapter)gen33).invokeConstructor((clojure.asm.Type)((clojure.asm.Type)super_type16), (clojure.asm.commons.Method)((clojure.asm.commons.Method)m32));
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke("super(", ((IFn)const__16.getRawRoot()).invoke(const__15.getRawRoot(), ((IFn)const__17.getRawRoot()).invoke(", ", ((IFn)const__19.getRawRoot()).invoke(new clojure.core_generate_proxy_fn__5227(), ((IFn)const__25.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses30))))))), ");")));
             clojure.lang.Compiler.untab();
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
             ((clojure.asm.commons.GeneratorAdapter)gen33).returnValue();
             ((clojure.asm.commons.GeneratorAdapter)gen33).endMethod();
            }
           }
           long i_522428___aux = clojure.lang.Numbers.unchecked_inc((long)i_522428);
           i_522428 = i_522428___aux;
           continue;
          }
         } else {
          {
           Object temp__4117__auto__34 = ((IFn)const__23.getRawRoot()).invoke(seq_522125);
           Object __r3359 = temp__4117__auto__34;
           if (__r3359 != null && !(__r3359 == Boolean.FALSE)) {
            {
             Object seq_522135 = temp__4117__auto__34;
             Object __r3361 = ((IFn)const__28.getRawRoot()).invoke(seq_522135);
             if (__r3361 != null && !(__r3361 == Boolean.FALSE)) {
              {
               Object c__4343__auto__36 = ((IFn)const__29.getRawRoot()).invoke(seq_522135);
               java.lang.Object seq_522125___aux = ((IFn)const__30.getRawRoot()).invoke(seq_522135);
               java.lang.Object chunk_522226___aux = c__4343__auto__36;
               long count_522327___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__36)));
               long i_522428___aux = clojure.lang.RT.intCast((long)0L);
               seq_522125 = seq_522125___aux;
               chunk_522226 = chunk_522226___aux;
               count_522327 = count_522327___aux;
               i_522428 = i_522428___aux;
               continue;
              }
             } else {
              {
               Object ctor37 = ((IFn)const__32.getRawRoot()).invoke(seq_522135);
               if (java.lang.reflect.Modifier.isPrivate((int)((java.lang.reflect.Constructor)ctor37).getModifiers())) {
               } else {
                {
                 Object pclasses38 = ((java.lang.Class[])((java.lang.reflect.Constructor)ctor37).getParameterTypes());
                 Object ptypes39 = ((IFn)to_types15).invoke(pclasses38);
                 Object m40 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"<init>"), (clojure.asm.Type)((clojure.asm.Type)((clojure.asm.Type)clojure.asm.Type.VOID_TYPE)), (clojure.asm.Type[])((clojure.asm.Type[])ptypes39));
                 Object gen41 = new clojure.asm.commons.GeneratorAdapter((int)clojure.asm.Opcodes.ACC_PUBLIC, (clojure.asm.commons.Method)((clojure.asm.commons.Method)m40), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv3));
                 ((clojure.asm.MethodAdapter)gen41).visitCode();
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke("public ", classname10, "(", ((IFn)const__16.getRawRoot()).invoke(const__15.getRawRoot(), ((IFn)const__17.getRawRoot()).invoke(", ", ((IFn)const__19.getRawRoot()).invoke(new clojure.core_generate_proxy_fn__5229(pclasses38), ((IFn)const__25.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses38))))))), ") {")));
                 clojure.lang.Compiler.tab();
                 ((clojure.asm.commons.GeneratorAdapter)gen41).loadThis();
                 ((clojure.asm.commons.GeneratorAdapter)gen41).dup();
                 ((clojure.asm.commons.GeneratorAdapter)gen41).loadArgs();
                 ((clojure.asm.commons.GeneratorAdapter)gen41).invokeConstructor((clojure.asm.Type)((clojure.asm.Type)super_type16), (clojure.asm.commons.Method)((clojure.asm.commons.Method)m40));
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke("super(", ((IFn)const__16.getRawRoot()).invoke(const__15.getRawRoot(), ((IFn)const__17.getRawRoot()).invoke(", ", ((IFn)const__19.getRawRoot()).invoke(new clojure.core_generate_proxy_fn__5231(), ((IFn)const__25.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses38))))))), ");")));
                 clojure.lang.Compiler.untab();
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
                 ((clojure.asm.commons.GeneratorAdapter)gen41).returnValue();
                 ((clojure.asm.commons.GeneratorAdapter)gen41).endMethod();
                }
               }
               java.lang.Object seq_522125___aux = ((IFn)const__33.getRawRoot()).invoke(seq_522135);
               java.lang.Object chunk_522226___aux = null;
               long count_522327___aux = 0L;
               long i_522428___aux = 0L;
               seq_522125 = seq_522125___aux;
               chunk_522226 = chunk_522226___aux;
               count_522327 = count_522327___aux;
               i_522428 = i_522428___aux;
               continue;
              }
             }
            }
           } else {
           }
          }
         }
         break;
        }
       }
       {
        Object m42 = ((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"void __initClojureFnMappings(clojure.lang.IPersistentMap)")));
        Object gen43 = new clojure.asm.commons.GeneratorAdapter((int)clojure.asm.Opcodes.ACC_PUBLIC, (clojure.asm.commons.Method)((clojure.asm.commons.Method)m42), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv3));
        ((clojure.asm.MethodAdapter)gen43).visitCode();
        ((clojure.asm.commons.GeneratorAdapter)gen43).loadThis();
        ((clojure.asm.commons.GeneratorAdapter)gen43).loadArgs();
        ((clojure.asm.commons.GeneratorAdapter)gen43).putField((clojure.asm.Type)((clojure.asm.Type)ctype8), (java.lang.String)((java.lang.String)fmap13), (clojure.asm.Type)((clojure.asm.Type)imap_type17));
        ((clojure.asm.commons.GeneratorAdapter)gen43).returnValue();
        ((clojure.asm.commons.GeneratorAdapter)gen43).endMethod();
       }
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke("public void __initClojureFnMappings(final IPersistentMap _clojureFnMap) {")));
       clojure.lang.Compiler.tab();
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"this.__clojureFnMap = _clojureFnMap;"));
       clojure.lang.Compiler.untab();
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke("}")));
       {
        Object m44 = ((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"void __updateClojureFnMappings(clojure.lang.IPersistentMap)")));
        Object gen45 = new clojure.asm.commons.GeneratorAdapter((int)clojure.asm.Opcodes.ACC_PUBLIC, (clojure.asm.commons.Method)((clojure.asm.commons.Method)m44), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv3));
        ((clojure.asm.MethodAdapter)gen45).visitCode();
        ((clojure.asm.commons.GeneratorAdapter)gen45).loadThis();
        ((clojure.asm.commons.GeneratorAdapter)gen45).dup();
        ((clojure.asm.commons.GeneratorAdapter)gen45).getField((clojure.asm.Type)((clojure.asm.Type)ctype8), (java.lang.String)((java.lang.String)fmap13), (clojure.asm.Type)((clojure.asm.Type)imap_type17));
        ((clojure.asm.commons.GeneratorAdapter)gen45).checkCast((clojure.asm.Type)((clojure.asm.Type)((IFn)totype14).invoke(const__34)));
        ((clojure.asm.commons.GeneratorAdapter)gen45).loadArgs();
        ((clojure.asm.commons.GeneratorAdapter)gen45).invokeInterface((clojure.asm.Type)((clojure.asm.Type)((IFn)totype14).invoke(const__34)), (clojure.asm.commons.Method)((clojure.asm.commons.Method)((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"clojure.lang.IPersistentCollection cons(Object)")))));
        ((clojure.asm.commons.GeneratorAdapter)gen45).checkCast((clojure.asm.Type)((clojure.asm.Type)imap_type17));
        ((clojure.asm.commons.GeneratorAdapter)gen45).putField((clojure.asm.Type)((clojure.asm.Type)ctype8), (java.lang.String)((java.lang.String)fmap13), (clojure.asm.Type)((clojure.asm.Type)imap_type17));
        ((clojure.asm.commons.GeneratorAdapter)gen45).returnValue();
        ((clojure.asm.commons.GeneratorAdapter)gen45).endMethod();
       }
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke("public void __updateClojureFnMappings(final IPersistentMap persistentMap) {")));
       clojure.lang.Compiler.tab();
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"this.__clojureFnMap = (IPersistentMap)((IPersistentCollection)this.__clojureFnMap).cons(persistentMap);"));
       clojure.lang.Compiler.untab();
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke("}")));
       {
        Object m46 = ((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"clojure.lang.IPersistentMap __getClojureFnMappings()")));
        Object gen47 = new clojure.asm.commons.GeneratorAdapter((int)clojure.asm.Opcodes.ACC_PUBLIC, (clojure.asm.commons.Method)((clojure.asm.commons.Method)m46), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv3));
        ((clojure.asm.MethodAdapter)gen47).visitCode();
        ((clojure.asm.commons.GeneratorAdapter)gen47).loadThis();
        ((clojure.asm.commons.GeneratorAdapter)gen47).getField((clojure.asm.Type)((clojure.asm.Type)ctype8), (java.lang.String)((java.lang.String)fmap13), (clojure.asm.Type)((clojure.asm.Type)imap_type17));
        ((clojure.asm.commons.GeneratorAdapter)gen47).returnValue();
        ((clojure.asm.commons.GeneratorAdapter)gen47).endMethod();
       }
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke("public IPersistentMap __getClojureFnMappings() {")));
       clojure.lang.Compiler.tab();
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"return this.__clojureFnMap;"));
       clojure.lang.Compiler.untab();
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke("}")));
       {
        Object vec__523348 = ((IFn)new clojure.core_generate_proxy_fn__5234(super1)).invoke();
        Object mm49 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__523348), (int)RT.intCast(0L), ((java.lang.Object)null)));
        Object considered50 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__523348), (int)RT.intCast(1L), ((java.lang.Object)null)));
        Object __r3363 = null;
        {
         Object iter__4618__auto__51 = new clojure.core_generate_proxy_iter__5244__5250(considered50);
         __r3363 = ((IFn)iter__4618__auto__51).invoke(interfaces2);
        }
        Object ifaces_meths52 = ((IFn)const__37.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY, __r3363);
        Object mgroups53 = ((IFn)const__38.getRawRoot()).invoke(((IFn)const__39.getRawRoot()).invoke(mm49, ifaces_meths52));
        Object rtypes54 = ((IFn)const__19.getRawRoot()).invoke(new clojure.core_generate_proxy_fn__5267(), mgroups53);
        Object mb55 = ((IFn)const__19.getRawRoot()).invoke(new clojure.core_generate_proxy_fn__5269(), mgroups53, rtypes54);
        Object bridge_QMARK_56 = ((IFn)const__40.getRawRoot()).invoke(const__37.getRawRoot(), clojure.lang.PersistentHashSet.EMPTY, ((IFn)const__19.getRawRoot()).invoke(const__41.getRawRoot(), mb55));
        Object ifaces_meths57 = ((IFn)const__42.getRawRoot()).invoke(bridge_QMARK_56, ((IFn)const__43.getRawRoot()).invoke(ifaces_meths52));
        Object mm58 = ((IFn)const__42.getRawRoot()).invoke(bridge_QMARK_56, ((IFn)const__43.getRawRoot()).invoke(mm49));
        {
         Object seq_527159 = ((IFn)const__23.getRawRoot()).invoke(mb55);
         Object chunk_527260 = null;
         long count_527361 = 0L;
         long i_527462 = 0L;
         while(true) {
          if (clojure.lang.Numbers.lt((long)i_527462, (long)count_527361)) {
           {
            Object vec__528363 = ((java.lang.Object)((clojure.lang.Indexed)chunk_527260).nth((int)RT.intCast(i_527462)));
            Object dest64 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__528363), (int)RT.intCast(0L), ((java.lang.Object)null)));
            Object bridges65 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__528363), (int)RT.intCast(1L), ((java.lang.Object)null)));
            {
             Object seq_527966 = ((IFn)const__23.getRawRoot()).invoke(bridges65);
             Object chunk_528067 = null;
             long count_528168 = 0L;
             long i_528269 = 0L;
             while(true) {
              if (clojure.lang.Numbers.lt((long)i_528269, (long)count_528168)) {
               {
                Object meth70 = ((java.lang.Object)((clojure.lang.Indexed)chunk_528067).nth((int)RT.intCast(i_528269)));
                ((IFn)gen_bridge23).invoke(meth70, dest64);
                long i_528269___aux = clojure.lang.Numbers.unchecked_inc((long)i_528269);
                i_528269 = i_528269___aux;
                continue;
               }
              } else {
               {
                Object temp__4117__auto__71 = ((IFn)const__23.getRawRoot()).invoke(seq_527966);
                Object __r3367 = temp__4117__auto__71;
                if (__r3367 != null && !(__r3367 == Boolean.FALSE)) {
                 {
                  Object seq_527972 = temp__4117__auto__71;
                  Object __r3369 = ((IFn)const__28.getRawRoot()).invoke(seq_527972);
                  if (__r3369 != null && !(__r3369 == Boolean.FALSE)) {
                   {
                    Object c__4343__auto__73 = ((IFn)const__29.getRawRoot()).invoke(seq_527972);
                    java.lang.Object seq_527966___aux = ((IFn)const__30.getRawRoot()).invoke(seq_527972);
                    java.lang.Object chunk_528067___aux = c__4343__auto__73;
                    long count_528168___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__73)));
                    long i_528269___aux = clojure.lang.RT.intCast((long)0L);
                    seq_527966 = seq_527966___aux;
                    chunk_528067 = chunk_528067___aux;
                    count_528168 = count_528168___aux;
                    i_528269 = i_528269___aux;
                    continue;
                   }
                  } else {
                   {
                    Object meth74 = ((IFn)const__32.getRawRoot()).invoke(seq_527972);
                    ((IFn)gen_bridge23).invoke(meth74, dest64);
                    java.lang.Object seq_527966___aux = ((IFn)const__33.getRawRoot()).invoke(seq_527972);
                    java.lang.Object chunk_528067___aux = null;
                    long count_528168___aux = 0L;
                    long i_528269___aux = 0L;
                    seq_527966 = seq_527966___aux;
                    chunk_528067 = chunk_528067___aux;
                    count_528168 = count_528168___aux;
                    i_528269 = i_528269___aux;
                    continue;
                   }
                  }
                 }
                } else {
                }
               }
              }
              break;
             }
            }
            long i_527462___aux = clojure.lang.Numbers.unchecked_inc((long)i_527462);
            i_527462 = i_527462___aux;
            continue;
           }
          } else {
           {
            Object temp__4117__auto__75 = ((IFn)const__23.getRawRoot()).invoke(seq_527159);
            Object __r3371 = temp__4117__auto__75;
            if (__r3371 != null && !(__r3371 == Boolean.FALSE)) {
             {
              Object seq_527176 = temp__4117__auto__75;
              Object __r3373 = ((IFn)const__28.getRawRoot()).invoke(seq_527176);
              if (__r3373 != null && !(__r3373 == Boolean.FALSE)) {
               {
                Object c__4343__auto__77 = ((IFn)const__29.getRawRoot()).invoke(seq_527176);
                java.lang.Object seq_527159___aux = ((IFn)const__30.getRawRoot()).invoke(seq_527176);
                java.lang.Object chunk_527260___aux = c__4343__auto__77;
                long count_527361___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__77)));
                long i_527462___aux = clojure.lang.RT.intCast((long)0L);
                seq_527159 = seq_527159___aux;
                chunk_527260 = chunk_527260___aux;
                count_527361 = count_527361___aux;
                i_527462 = i_527462___aux;
                continue;
               }
              } else {
               {
                Object vec__528478 = ((IFn)const__32.getRawRoot()).invoke(seq_527176);
                Object dest79 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__528478), (int)RT.intCast(0L), ((java.lang.Object)null)));
                Object bridges80 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__528478), (int)RT.intCast(1L), ((java.lang.Object)null)));
                {
                 Object seq_527581 = ((IFn)const__23.getRawRoot()).invoke(bridges80);
                 Object chunk_527682 = null;
                 long count_527783 = 0L;
                 long i_527884 = 0L;
                 while(true) {
                  if (clojure.lang.Numbers.lt((long)i_527884, (long)count_527783)) {
                   {
                    Object meth85 = ((java.lang.Object)((clojure.lang.Indexed)chunk_527682).nth((int)RT.intCast(i_527884)));
                    ((IFn)gen_bridge23).invoke(meth85, dest79);
                    long i_527884___aux = clojure.lang.Numbers.unchecked_inc((long)i_527884);
                    i_527884 = i_527884___aux;
                    continue;
                   }
                  } else {
                   {
                    Object temp__4117__auto__86 = ((IFn)const__23.getRawRoot()).invoke(seq_527581);
                    Object __r3376 = temp__4117__auto__86;
                    if (__r3376 != null && !(__r3376 == Boolean.FALSE)) {
                     {
                      Object seq_527587 = temp__4117__auto__86;
                      Object __r3378 = ((IFn)const__28.getRawRoot()).invoke(seq_527587);
                      if (__r3378 != null && !(__r3378 == Boolean.FALSE)) {
                       {
                        Object c__4343__auto__88 = ((IFn)const__29.getRawRoot()).invoke(seq_527587);
                        java.lang.Object seq_527581___aux = ((IFn)const__30.getRawRoot()).invoke(seq_527587);
                        java.lang.Object chunk_527682___aux = c__4343__auto__88;
                        long count_527783___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__88)));
                        long i_527884___aux = clojure.lang.RT.intCast((long)0L);
                        seq_527581 = seq_527581___aux;
                        chunk_527682 = chunk_527682___aux;
                        count_527783 = count_527783___aux;
                        i_527884 = i_527884___aux;
                        continue;
                       }
                      } else {
                       {
                        Object meth89 = ((IFn)const__32.getRawRoot()).invoke(seq_527587);
                        ((IFn)gen_bridge23).invoke(meth89, dest79);
                        java.lang.Object seq_527581___aux = ((IFn)const__33.getRawRoot()).invoke(seq_527587);
                        java.lang.Object chunk_527682___aux = null;
                        long count_527783___aux = 0L;
                        long i_527884___aux = 0L;
                        seq_527581 = seq_527581___aux;
                        chunk_527682 = chunk_527682___aux;
                        count_527783 = count_527783___aux;
                        i_527884 = i_527884___aux;
                        continue;
                       }
                      }
                     }
                    } else {
                    }
                   }
                  }
                  break;
                 }
                }
                java.lang.Object seq_527159___aux = ((IFn)const__33.getRawRoot()).invoke(seq_527176);
                java.lang.Object chunk_527260___aux = null;
                long count_527361___aux = 0L;
                long i_527462___aux = 0L;
                seq_527159 = seq_527159___aux;
                chunk_527260 = chunk_527260___aux;
                count_527361 = count_527361___aux;
                i_527462 = i_527462___aux;
                continue;
               }
              }
             }
            } else {
            }
           }
          }
          break;
         }
        }
        {
         Object seq_528590 = ((IFn)const__23.getRawRoot()).invoke(mm58);
         Object chunk_528691 = null;
         long count_528792 = 0L;
         long i_528893 = 0L;
         while(true) {
          if (clojure.lang.Numbers.lt((long)i_528893, (long)count_528792)) {
           {
            Object meth94 = ((java.lang.Object)((clojure.lang.Indexed)chunk_528691).nth((int)RT.intCast(i_528893)));
            ((IFn)gen_method24).invoke(meth94, new clojure.core_generate_proxy_fn__5289(super_type16, meth94));
            long i_528893___aux = clojure.lang.Numbers.unchecked_inc((long)i_528893);
            i_528893 = i_528893___aux;
            continue;
           }
          } else {
           {
            Object temp__4117__auto__95 = ((IFn)const__23.getRawRoot()).invoke(seq_528590);
            Object __r3381 = temp__4117__auto__95;
            if (__r3381 != null && !(__r3381 == Boolean.FALSE)) {
             {
              Object seq_528596 = temp__4117__auto__95;
              Object __r3383 = ((IFn)const__28.getRawRoot()).invoke(seq_528596);
              if (__r3383 != null && !(__r3383 == Boolean.FALSE)) {
               {
                Object c__4343__auto__97 = ((IFn)const__29.getRawRoot()).invoke(seq_528596);
                java.lang.Object seq_528590___aux = ((IFn)const__30.getRawRoot()).invoke(seq_528596);
                java.lang.Object chunk_528691___aux = c__4343__auto__97;
                long count_528792___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__97)));
                long i_528893___aux = clojure.lang.RT.intCast((long)0L);
                seq_528590 = seq_528590___aux;
                chunk_528691 = chunk_528691___aux;
                count_528792 = count_528792___aux;
                i_528893 = i_528893___aux;
                continue;
               }
              } else {
               {
                Object meth98 = ((IFn)const__32.getRawRoot()).invoke(seq_528596);
                ((IFn)gen_method24).invoke(meth98, new clojure.core_generate_proxy_fn__5293(meth98, super_type16));
                java.lang.Object seq_528590___aux = ((IFn)const__33.getRawRoot()).invoke(seq_528596);
                java.lang.Object chunk_528691___aux = null;
                long count_528792___aux = 0L;
                long i_528893___aux = 0L;
                seq_528590 = seq_528590___aux;
                chunk_528691 = chunk_528691___aux;
                count_528792 = count_528792___aux;
                i_528893 = i_528893___aux;
                continue;
               }
              }
             }
            } else {
            }
           }
          }
          break;
         }
        }
        {
         Object seq_529799 = ((IFn)const__23.getRawRoot()).invoke(ifaces_meths57);
         Object chunk_5298100 = null;
         long count_5299101 = 0L;
         long i_5300102 = 0L;
         while(true) {
          if (clojure.lang.Numbers.lt((long)i_5300102, (long)count_5299101)) {
           {
            Object meth103 = ((java.lang.Object)((clojure.lang.Indexed)chunk_5298100).nth((int)RT.intCast(i_5300102)));
            ((IFn)gen_method24).invoke(meth103, new clojure.core_generate_proxy_fn__5301(ex_type22));
            long i_5300102___aux = clojure.lang.Numbers.unchecked_inc((long)i_5300102);
            i_5300102 = i_5300102___aux;
            continue;
           }
          } else {
           {
            Object temp__4117__auto__104 = ((IFn)const__23.getRawRoot()).invoke(seq_529799);
            Object __r3386 = temp__4117__auto__104;
            if (__r3386 != null && !(__r3386 == Boolean.FALSE)) {
             {
              Object seq_5297105 = temp__4117__auto__104;
              Object __r3388 = ((IFn)const__28.getRawRoot()).invoke(seq_5297105);
              if (__r3388 != null && !(__r3388 == Boolean.FALSE)) {
               {
                Object c__4343__auto__106 = ((IFn)const__29.getRawRoot()).invoke(seq_5297105);
                java.lang.Object seq_529799___aux = ((IFn)const__30.getRawRoot()).invoke(seq_5297105);
                java.lang.Object chunk_5298100___aux = c__4343__auto__106;
                long count_5299101___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__106)));
                long i_5300102___aux = clojure.lang.RT.intCast((long)0L);
                seq_529799 = seq_529799___aux;
                chunk_5298100 = chunk_5298100___aux;
                count_5299101 = count_5299101___aux;
                i_5300102 = i_5300102___aux;
                continue;
               }
              } else {
               {
                Object meth107 = ((IFn)const__32.getRawRoot()).invoke(seq_5297105);
                ((IFn)gen_method24).invoke(meth107, new clojure.core_generate_proxy_fn__5303(ex_type22));
                java.lang.Object seq_529799___aux = ((IFn)const__33.getRawRoot()).invoke(seq_5297105);
                java.lang.Object chunk_5298100___aux = null;
                long count_5299101___aux = 0L;
                long i_5300102___aux = 0L;
                seq_529799 = seq_529799___aux;
                chunk_5298100 = chunk_5298100___aux;
                count_5299101 = count_5299101___aux;
                i_5300102 = i_5300102___aux;
                continue;
               }
              }
             }
            } else {
            }
           }
          }
          break;
         }
        }
       }
       ((clojure.asm.ClassWriter)cv3).visitEnd();
       clojure.lang.Compiler.untab();
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
       Object __r3390 = const__44.get();
       if (__r3390 != null && !(__r3390 == Boolean.FALSE)) {
        clojure.lang.Compiler.writeSourceFile((java.lang.String)((java.lang.String)cname7), (java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke(const__2.get())));
       } else {
       }
       return RT.vector(cname7, ((byte[])((clojure.asm.ClassWriter)cv3).toByteArray()));
      }
     } finally {
      ((IFn)const__45.getRawRoot()).invoke();
     }
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
