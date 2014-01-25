package clojure;

import clojure.lang.*;

public final class core_generate_interface extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final java.lang.Object const__21;
 public static final java.lang.Object const__22;
 public static final java.lang.Object const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.Var const__25;
 public static final clojure.lang.Var const__26;
 public static final clojure.lang.Var const__27;
 public static final clojure.lang.Var const__28;
 public static final java.lang.Object const__29;
 public static final clojure.lang.Var const__30;
 public static final clojure.lang.Var const__31;
 public static final clojure.lang.Var const__32;
 public static final clojure.lang.Var const__33;
 public static final clojure.lang.Var const__34;
 public static final clojure.lang.Var const__35;
 public static final clojure.lang.Var const__36;
 public static final clojure.lang.Var const__37;
 public static final clojure.lang.Var const__38;
 public static final clojure.lang.Var const__39;
 public static final clojure.lang.Var const__40;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "methods");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "extends");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "name");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__10 = (java.lang.Object)0L;
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "*source-writer*");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "into-array");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "add-annotations");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__21 = (java.lang.Object)1L;
  const__22 = (java.lang.Object)2L;
  const__23 = (java.lang.Object)3L;
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__28 = (clojure.lang.Var)RT.var("clojure.core", "asm-type");
  const__29 = (java.lang.Object)clojure.asm.Type.class;
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "make-array");
  const__31 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__32 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__33 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__34 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__35 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__36 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__37 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__38 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__39 = (clojure.lang.Var)RT.var("clojure.core", "*compile-files*");
  const__40 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public core_generate_interface() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__57201) {
  try {
   {
    Object map__57212 = p__57201;
    Object __r3679;
    Object __r3680 = ((IFn)const__0.getRawRoot()).invoke(map__57212);
    if (__r3680 != null && !(__r3680 == Boolean.FALSE)) {
     __r3679 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__1.getRawRoot()).invoke(map__57212))));
    } else {
     __r3679 = map__57212;
    }
    Object map__57213 = __r3679;
    Object methods4 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__57213), ((java.lang.Object)const__3)));
    Object extends5 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__57213), ((java.lang.Object)const__4)));
    Object name6 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__57213), ((java.lang.Object)const__5)));
    Object __r3682 = ((IFn)const__6.getRawRoot()).invoke(new clojure.core_generate_interface_fn__5722(), methods4);
    if (__r3682 != null && !(__r3682 == Boolean.FALSE)) {
     Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)"Interface methods must not contain '-'")));
    } else {
    }
    {
     Object sname7 = ((IFn)const__7.getRawRoot()).invoke(name6);
     Object iname8 = ((java.lang.String)((java.lang.String)sname7).replace((java.lang.CharSequence)((java.lang.CharSequence)"."), (java.lang.CharSequence)((java.lang.CharSequence)"/")));
     Object cv9 = new clojure.asm.ClassWriter((int)clojure.asm.ClassWriter.COMPUTE_MAXS);
     int lastdot10 = ((java.lang.String)sname7).lastIndexOf((java.lang.String)((java.lang.String)"."));
     Object classname11 = ((IFn)const__8.getRawRoot()).invoke(sname7, Numbers.num(clojure.lang.Numbers.inc((long)lastdot10)));
     Object packagename12 = ((IFn)const__8.getRawRoot()).invoke(sname7, const__10, Integer.valueOf(lastdot10));
     {
      ((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__13, ((clojure.lang.SourceWriter)((clojure.asm.ClassWriter)cv9).getSc())));
      try {
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__7.getRawRoot()).invoke("package ", packagename12, ";")));
       clojure.lang.Compiler.emitSource();
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__7.getRawRoot()).invoke("public interface ", classname11, " {")));
       clojure.lang.Compiler.tab();
       Object __r3683;
       Object __r3684 = ((IFn)const__1.getRawRoot()).invoke(extends5);
       if (__r3684 != null && !(__r3684 == Boolean.FALSE)) {
        __r3683 = ((IFn)const__15.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(new clojure.core_generate_interface_fn__5724(), extends5));
       } else {
        __r3683 = null;
       }
       ((clojure.asm.ClassWriter)cv9).visit((int)clojure.asm.Opcodes.V1_5, (int)RT.intCast(clojure.lang.Numbers.add((long)clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PUBLIC, (long)clojure.asm.Opcodes.ACC_ABSTRACT), (long)clojure.asm.Opcodes.ACC_INTERFACE)), (java.lang.String)((java.lang.String)iname8), (java.lang.String)((java.lang.String)null), (java.lang.String)((java.lang.String)"java/lang/Object"), (java.lang.String[])((java.lang.String[])__r3683));
       ((IFn)const__17.getRawRoot()).invoke(cv9, ((IFn)const__18.getRawRoot()).invoke(name6));
       {
        Object seq_572615 = ((IFn)const__1.getRawRoot()).invoke(methods4);
        Object chunk_572716 = null;
        long count_572817 = 0L;
        long i_572918 = 0L;
        while(true) {
         if (clojure.lang.Numbers.lt((long)i_572918, (long)count_572817)) {
          {
           Object vec__573019 = ((java.lang.Object)((clojure.lang.Indexed)chunk_572716).nth((int)RT.intCast(i_572918)));
           Object mname20 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__573019), (int)RT.intCast(0L), ((java.lang.Object)null)));
           Object pclasses21 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__573019), (int)RT.intCast(1L), ((java.lang.Object)null)));
           Object rclass22 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__573019), (int)RT.intCast(2L), ((java.lang.Object)null)));
           Object pmetas23 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__573019), (int)RT.intCast(3L), ((java.lang.Object)null)));
           Object __r3686 = null;
           {
            Object names24 = ((IFn)const__16.getRawRoot()).invoke(new clojure.core_generate_interface_fn__5731(pclasses21), ((IFn)const__24.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses21)))));
            __r3686 = ((IFn)const__26.getRawRoot()).invoke(const__7.getRawRoot(), ((IFn)const__27.getRawRoot()).invoke(", ", names24));
           }
           clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__7.getRawRoot()).invoke(((java.lang.String)clojure.lang.Compiler.HostExpr.tagToCanonical(((java.lang.Object)rclass22))), " ", ((IFn)const__7.getRawRoot()).invoke(mname20), "(", __r3686, ");")));
           {
            Object __r3687;
            Object __r3688 = pclasses21;
            if (__r3688 != null && !(__r3688 == Boolean.FALSE)) {
             __r3687 = ((IFn)const__15.getRawRoot()).invoke(const__29, ((IFn)const__16.getRawRoot()).invoke(const__28.getRawRoot(), pclasses21));
            } else {
             __r3687 = ((IFn)const__30.getRawRoot()).invoke(const__29, const__10);
            }
            Object mv25 = ((clojure.asm.MethodVisitor)((clojure.asm.ClassWriter)cv9).visitMethod((int)RT.intCast(clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PUBLIC, (long)clojure.asm.Opcodes.ACC_ABSTRACT)), (java.lang.String)((java.lang.String)((IFn)const__7.getRawRoot()).invoke(mname20)), (java.lang.String)((java.lang.String)((java.lang.String)clojure.asm.Type.getMethodDescriptor((clojure.asm.Type)((clojure.asm.Type)((IFn)const__28.getRawRoot()).invoke(rclass22)), (clojure.asm.Type[])((clojure.asm.Type[])__r3687)))), (java.lang.String)((java.lang.String)null), (java.lang.String[])((java.lang.String[])null)));
            ((IFn)const__17.getRawRoot()).invoke(mv25, ((IFn)const__18.getRawRoot()).invoke(mname20));
            {
             long n__4366__auto__26 = clojure.lang.RT.longCast((int)clojure.lang.RT.count(((java.lang.Object)pmetas23)));
             {
              long i27 = 0L;
              while(true) {
               if (clojure.lang.Numbers.lt((long)i27, (long)n__4366__auto__26)) {
                ((IFn)const__17.getRawRoot()).invoke(mv25, ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)pmetas23), (int)RT.intCast(i27))), Numbers.num(i27));
                long i27___aux = clojure.lang.Numbers.unchecked_inc((long)i27);
                i27 = i27___aux;
                continue;
               } else {
               }
               break;
              }
             }
            }
            ((clojure.asm.MethodVisitor)mv25).visitEnd();
           }
           long i_572918___aux = clojure.lang.Numbers.unchecked_inc((long)i_572918);
           i_572918 = i_572918___aux;
           continue;
          }
         } else {
          {
           Object temp__4117__auto__28 = ((IFn)const__1.getRawRoot()).invoke(seq_572615);
           Object __r3691 = temp__4117__auto__28;
           if (__r3691 != null && !(__r3691 == Boolean.FALSE)) {
            {
             Object seq_572629 = temp__4117__auto__28;
             Object __r3693 = ((IFn)const__33.getRawRoot()).invoke(seq_572629);
             if (__r3693 != null && !(__r3693 == Boolean.FALSE)) {
              {
               Object c__4343__auto__30 = ((IFn)const__34.getRawRoot()).invoke(seq_572629);
               java.lang.Object seq_572615___aux = ((IFn)const__35.getRawRoot()).invoke(seq_572629);
               java.lang.Object chunk_572716___aux = c__4343__auto__30;
               long count_572817___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__30)));
               long i_572918___aux = clojure.lang.RT.intCast((long)0L);
               seq_572615 = seq_572615___aux;
               chunk_572716 = chunk_572716___aux;
               count_572817 = count_572817___aux;
               i_572918 = i_572918___aux;
               continue;
              }
             } else {
              {
               Object vec__573331 = ((IFn)const__37.getRawRoot()).invoke(seq_572629);
               Object mname32 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__573331), (int)RT.intCast(0L), ((java.lang.Object)null)));
               Object pclasses33 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__573331), (int)RT.intCast(1L), ((java.lang.Object)null)));
               Object rclass34 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__573331), (int)RT.intCast(2L), ((java.lang.Object)null)));
               Object pmetas35 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__573331), (int)RT.intCast(3L), ((java.lang.Object)null)));
               Object __r3694 = null;
               {
                Object names36 = ((IFn)const__16.getRawRoot()).invoke(new clojure.core_generate_interface_fn__5734(pclasses33), ((IFn)const__24.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses33)))));
                __r3694 = ((IFn)const__26.getRawRoot()).invoke(const__7.getRawRoot(), ((IFn)const__27.getRawRoot()).invoke(", ", names36));
               }
               clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__7.getRawRoot()).invoke(((java.lang.String)clojure.lang.Compiler.HostExpr.tagToCanonical(((java.lang.Object)rclass34))), " ", ((IFn)const__7.getRawRoot()).invoke(mname32), "(", __r3694, ");")));
               {
                Object __r3695;
                Object __r3696 = pclasses33;
                if (__r3696 != null && !(__r3696 == Boolean.FALSE)) {
                 __r3695 = ((IFn)const__15.getRawRoot()).invoke(const__29, ((IFn)const__16.getRawRoot()).invoke(const__28.getRawRoot(), pclasses33));
                } else {
                 __r3695 = ((IFn)const__30.getRawRoot()).invoke(const__29, const__10);
                }
                Object mv37 = ((clojure.asm.MethodVisitor)((clojure.asm.ClassWriter)cv9).visitMethod((int)RT.intCast(clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PUBLIC, (long)clojure.asm.Opcodes.ACC_ABSTRACT)), (java.lang.String)((java.lang.String)((IFn)const__7.getRawRoot()).invoke(mname32)), (java.lang.String)((java.lang.String)((java.lang.String)clojure.asm.Type.getMethodDescriptor((clojure.asm.Type)((clojure.asm.Type)((IFn)const__28.getRawRoot()).invoke(rclass34)), (clojure.asm.Type[])((clojure.asm.Type[])__r3695)))), (java.lang.String)((java.lang.String)null), (java.lang.String[])((java.lang.String[])null)));
                ((IFn)const__17.getRawRoot()).invoke(mv37, ((IFn)const__18.getRawRoot()).invoke(mname32));
                {
                 long n__4366__auto__38 = clojure.lang.RT.longCast((int)clojure.lang.RT.count(((java.lang.Object)pmetas35)));
                 {
                  long i39 = 0L;
                  while(true) {
                   if (clojure.lang.Numbers.lt((long)i39, (long)n__4366__auto__38)) {
                    ((IFn)const__17.getRawRoot()).invoke(mv37, ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)pmetas35), (int)RT.intCast(i39))), Numbers.num(i39));
                    long i39___aux = clojure.lang.Numbers.unchecked_inc((long)i39);
                    i39 = i39___aux;
                    continue;
                   } else {
                   }
                   break;
                  }
                 }
                }
                ((clojure.asm.MethodVisitor)mv37).visitEnd();
               }
               java.lang.Object seq_572615___aux = ((IFn)const__38.getRawRoot()).invoke(seq_572629);
               java.lang.Object chunk_572716___aux = null;
               long count_572817___aux = 0L;
               long i_572918___aux = 0L;
               seq_572615 = seq_572615___aux;
               chunk_572716 = chunk_572716___aux;
               count_572817 = count_572817___aux;
               i_572918 = i_572918___aux;
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
       ((clojure.asm.ClassWriter)cv9).visitEnd();
       clojure.lang.Compiler.untab();
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
       Object __r3699 = const__39.get();
       if (__r3699 != null && !(__r3699 == Boolean.FALSE)) {
        clojure.lang.Compiler.writeSourceFile((java.lang.String)((java.lang.String)iname8), (java.lang.String)((java.lang.String)((IFn)const__7.getRawRoot()).invoke(const__13.get())));
       } else {
       }
       return RT.vector(iname8, ((byte[])((clojure.asm.ClassWriter)cv9).toByteArray()));
      } finally {
       ((IFn)const__40.getRawRoot()).invoke();
      }
     }
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
