package clojure;

import clojure.lang.*;

public final class core_add_annotations extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
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
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "add-annotations");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (java.lang.Object)0L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__5 = (java.lang.Object)1L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "resolve");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "is-annotation?");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "descriptor");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "is-runtime-annotation?");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "process-print-annotation");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "process-annotation");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_add_annotations() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object visitor1, java.lang.Object m2, java.lang.Object i3) {
  {
   Object seq_48594 = ((IFn)const__1.getRawRoot()).invoke(m2);
   Object chunk_48605 = null;
   long count_48616 = 0L;
   long i_48627 = 0L;
   while(true) {
    if (clojure.lang.Numbers.lt((long)i_48627, (long)count_48616)) {
     {
      Object vec__48638 = ((java.lang.Object)((clojure.lang.Indexed)chunk_48605).nth((int)RT.intCast(i_48627)));
      Object k9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__48638), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object v10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__48638), (int)RT.intCast(1L), ((java.lang.Object)null)));
      Object __r3007 = ((IFn)const__6.getRawRoot()).invoke(k9);
      if (__r3007 != null && !(__r3007 == Boolean.FALSE)) {
       {
        Object temp__4117__auto__11 = ((IFn)const__7.getRawRoot()).invoke(k9);
        Object __r3009 = temp__4117__auto__11;
        if (__r3009 != null && !(__r3009 == Boolean.FALSE)) {
         {
          Object c12 = temp__4117__auto__11;
          Object __r3011 = ((IFn)const__8.getRawRoot()).invoke(c12);
          if (__r3011 != null && !(__r3011 == Boolean.FALSE)) {
           {
            Object __r3012;
            Object __r3013 = i3;
            if (__r3013 != null && !(__r3013 == Boolean.FALSE)) {
             __r3012 = Reflector.invokeInstanceMethod(visitor1, "visitParameterAnnotation", new Object[]{i3, ((IFn)const__9.getRawRoot()).invoke(c12), ((IFn)const__10.getRawRoot()).invoke(c12)});
            } else {
             __r3012 = Reflector.invokeInstanceMethod(visitor1, "visitAnnotation", new Object[]{((IFn)const__9.getRawRoot()).invoke(c12), ((IFn)const__10.getRawRoot()).invoke(c12)});
            }
            Object av13 = __r3012;
            Object __r3014;
            if (clojure.lang.Util.equiv((long)0L, (long)clojure.lang.RT.count(((java.lang.Object)Reflector.invokeNoArgInstanceMember(c12, "getDeclaredMethods"))))) {
             __r3014 = "";
            } else {
             __r3014 = ((IFn)const__11.getRawRoot()).invoke("(", ((IFn)const__14.getRawRoot()).invoke(v10), ")");
            }
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__11.getRawRoot()).invoke("@", Reflector.invokeNoArgInstanceMember(c12, "getCanonicalName"), __r3014)));
            ((IFn)const__15.getRawRoot()).invoke(av13, v10);
            Reflector.invokeNoArgInstanceMember(av13, "visitEnd");
           }
          } else {
          }
         }
        } else {
        }
       }
      } else {
      }
      long i_48627___aux = clojure.lang.Numbers.unchecked_inc((long)i_48627);
      i_48627 = i_48627___aux;
      continue;
     }
    } else {
     {
      Object temp__4117__auto__14 = ((IFn)const__1.getRawRoot()).invoke(seq_48594);
      Object __r3016 = temp__4117__auto__14;
      if (__r3016 != null && !(__r3016 == Boolean.FALSE)) {
       {
        Object seq_485915 = temp__4117__auto__14;
        Object __r3018 = ((IFn)const__17.getRawRoot()).invoke(seq_485915);
        if (__r3018 != null && !(__r3018 == Boolean.FALSE)) {
         {
          Object c__4343__auto__16 = ((IFn)const__18.getRawRoot()).invoke(seq_485915);
          java.lang.Object seq_48594___aux = ((IFn)const__19.getRawRoot()).invoke(seq_485915);
          java.lang.Object chunk_48605___aux = c__4343__auto__16;
          long count_48616___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__16)));
          long i_48627___aux = clojure.lang.RT.intCast((long)0L);
          seq_48594 = seq_48594___aux;
          chunk_48605 = chunk_48605___aux;
          count_48616 = count_48616___aux;
          i_48627 = i_48627___aux;
          continue;
         }
        } else {
         {
          Object vec__486417 = ((IFn)const__21.getRawRoot()).invoke(seq_485915);
          Object k18 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__486417), (int)RT.intCast(0L), ((java.lang.Object)null)));
          Object v19 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__486417), (int)RT.intCast(1L), ((java.lang.Object)null)));
          Object __r3020 = ((IFn)const__6.getRawRoot()).invoke(k18);
          if (__r3020 != null && !(__r3020 == Boolean.FALSE)) {
           {
            Object temp__4117__auto__20 = ((IFn)const__7.getRawRoot()).invoke(k18);
            Object __r3022 = temp__4117__auto__20;
            if (__r3022 != null && !(__r3022 == Boolean.FALSE)) {
             {
              Object c21 = temp__4117__auto__20;
              Object __r3024 = ((IFn)const__8.getRawRoot()).invoke(c21);
              if (__r3024 != null && !(__r3024 == Boolean.FALSE)) {
               {
                Object __r3025;
                Object __r3026 = i3;
                if (__r3026 != null && !(__r3026 == Boolean.FALSE)) {
                 __r3025 = Reflector.invokeInstanceMethod(visitor1, "visitParameterAnnotation", new Object[]{i3, ((IFn)const__9.getRawRoot()).invoke(c21), ((IFn)const__10.getRawRoot()).invoke(c21)});
                } else {
                 __r3025 = Reflector.invokeInstanceMethod(visitor1, "visitAnnotation", new Object[]{((IFn)const__9.getRawRoot()).invoke(c21), ((IFn)const__10.getRawRoot()).invoke(c21)});
                }
                Object av22 = __r3025;
                Object __r3027;
                if (clojure.lang.Util.equiv((long)0L, (long)clojure.lang.RT.count(((java.lang.Object)Reflector.invokeNoArgInstanceMember(c21, "getDeclaredMethods"))))) {
                 __r3027 = "";
                } else {
                 __r3027 = ((IFn)const__11.getRawRoot()).invoke("(", ((IFn)const__14.getRawRoot()).invoke(v19), ")");
                }
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__11.getRawRoot()).invoke("@", Reflector.invokeNoArgInstanceMember(c21, "getCanonicalName"), __r3027)));
                ((IFn)const__15.getRawRoot()).invoke(av22, v19);
                Reflector.invokeNoArgInstanceMember(av22, "visitEnd");
               }
              } else {
              }
             }
            } else {
            }
           }
          } else {
          }
          java.lang.Object seq_48594___aux = ((IFn)const__22.getRawRoot()).invoke(seq_485915);
          java.lang.Object chunk_48605___aux = null;
          long count_48616___aux = 0L;
          long i_48627___aux = 0L;
          seq_48594 = seq_48594___aux;
          chunk_48605 = chunk_48605___aux;
          count_48616 = count_48616___aux;
          i_48627 = i_48627___aux;
          continue;
         }
        }
       }
      } else {
       return null;
      }
     }
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object visitor1, java.lang.Object m2) {
  return ((IFn)const__0.getRawRoot()).invoke(visitor1, m2, null);
 }
}
