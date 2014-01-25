package clojure;

import clojure.lang.*;

public final class core_add_annotation extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
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
 public static final java.lang.Object const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Keyword const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
 public static final java.lang.Object const__24;
 public static final clojure.lang.Var const__25;
 public static final clojure.lang.Var const__26;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (java.lang.Object)0L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "add-annotation");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "eval");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__16 = (java.lang.Object)java.lang.Enum.class;
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "descriptor");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "class?");
  const__21 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__24 = (java.lang.Object)1L;
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "resolve");
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "process-annotation");
 }
 public core_add_annotation() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object av1, java.lang.Object name2, java.lang.Object v3) {
  Object __r2979 = ((IFn)const__0.getRawRoot()).invoke(v3);
  if (__r2979 != null && !(__r2979 == Boolean.FALSE)) {
   {
    Object avec4 = ((clojure.asm.AnnotationVisitor)((clojure.asm.AnnotationVisitor)av1).visitArray((java.lang.String)((java.lang.String)name2)));
    {
     Object seq_48375 = ((IFn)const__1.getRawRoot()).invoke(v3);
     Object chunk_48386 = null;
     long count_48397 = 0L;
     long i_48408 = 0L;
     while(true) {
      if (clojure.lang.Numbers.lt((long)i_48408, (long)count_48397)) {
       {
        Object vval9 = ((java.lang.Object)((clojure.lang.Indexed)chunk_48386).nth((int)RT.intCast(i_48408)));
        ((IFn)const__4.getRawRoot()).invoke(avec4, "value", vval9);
        long i_48408___aux = clojure.lang.Numbers.unchecked_inc((long)i_48408);
        i_48408 = i_48408___aux;
        continue;
       }
      } else {
       {
        Object temp__4117__auto__10 = ((IFn)const__1.getRawRoot()).invoke(seq_48375);
        Object __r2982 = temp__4117__auto__10;
        if (__r2982 != null && !(__r2982 == Boolean.FALSE)) {
         {
          Object seq_483711 = temp__4117__auto__10;
          Object __r2984 = ((IFn)const__6.getRawRoot()).invoke(seq_483711);
          if (__r2984 != null && !(__r2984 == Boolean.FALSE)) {
           {
            Object c__4343__auto__12 = ((IFn)const__7.getRawRoot()).invoke(seq_483711);
            java.lang.Object seq_48375___aux = ((IFn)const__8.getRawRoot()).invoke(seq_483711);
            java.lang.Object chunk_48386___aux = c__4343__auto__12;
            long count_48397___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__12)));
            long i_48408___aux = clojure.lang.RT.intCast((long)0L);
            seq_48375 = seq_48375___aux;
            chunk_48386 = chunk_48386___aux;
            count_48397 = count_48397___aux;
            i_48408 = i_48408___aux;
            continue;
           }
          } else {
           {
            Object vval13 = ((IFn)const__11.getRawRoot()).invoke(seq_483711);
            ((IFn)const__4.getRawRoot()).invoke(avec4, "value", vval13);
            java.lang.Object seq_48375___aux = ((IFn)const__12.getRawRoot()).invoke(seq_483711);
            java.lang.Object chunk_48386___aux = null;
            long count_48397___aux = 0L;
            long i_48408___aux = 0L;
            seq_48375 = seq_48375___aux;
            chunk_48386 = chunk_48386___aux;
            count_48397 = count_48397___aux;
            i_48408 = i_48408___aux;
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
    ((clojure.asm.AnnotationVisitor)avec4).visitEnd();
    return null;
   }
  } else {
   Object __r2986 = ((IFn)const__13.getRawRoot()).invoke(v3);
   if (__r2986 != null && !(__r2986 == Boolean.FALSE)) {
    {
     Object ev14 = ((IFn)const__14.getRawRoot()).invoke(v3);
     if ((ev14 instanceof java.lang.Enum)) {
      ((clojure.asm.AnnotationVisitor)av1).visitEnum((java.lang.String)((java.lang.String)name2), (java.lang.String)((java.lang.String)((IFn)const__17.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(ev14))), (java.lang.String)((java.lang.String)((IFn)const__19.getRawRoot()).invoke(ev14)));
      return null;
     } else {
      Object __r2989 = ((IFn)const__20.getRawRoot()).invoke(ev14);
      if (__r2989 != null && !(__r2989 == Boolean.FALSE)) {
       ((clojure.asm.AnnotationVisitor)av1).visit((java.lang.String)((java.lang.String)name2), ((java.lang.Object)Reflector.invokeStaticMethod(clojure.asm.Type.class, "getType", new Object[]{ev14})));
       return null;
      } else {
       Object __r2991 = const__21;
       if (__r2991 != null && !(__r2991 == Boolean.FALSE)) {
        Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__19.getRawRoot()).invoke("Unsupported annotation value: ", v3, " of class ", ((IFn)const__18.getRawRoot()).invoke(ev14)))));
        return null;
       } else {
        return null;
       }
      }
     }
    }
   } else {
    Object __r2993 = ((IFn)const__22.getRawRoot()).invoke(v3);
    if (__r2993 != null && !(__r2993 == Boolean.FALSE)) {
     {
      Object vec__484115 = v3;
      Object nested16 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__484115), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object nv17 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__484115), (int)RT.intCast(1L), ((java.lang.Object)null)));
      Object c18 = ((IFn)const__25.getRawRoot()).invoke(nested16);
      Object nav19 = ((clojure.asm.AnnotationVisitor)((clojure.asm.AnnotationVisitor)av1).visitAnnotation((java.lang.String)((java.lang.String)name2), (java.lang.String)((java.lang.String)((IFn)const__17.getRawRoot()).invoke(c18))));
      ((IFn)const__26.getRawRoot()).invoke(nav19, nv17);
      ((clojure.asm.AnnotationVisitor)nav19).visitEnd();
      return null;
     }
    } else {
     Object __r2995 = const__21;
     if (__r2995 != null && !(__r2995 == Boolean.FALSE)) {
      ((clojure.asm.AnnotationVisitor)av1).visit((java.lang.String)((java.lang.String)name2), ((java.lang.Object)v3));
      return null;
     } else {
      return null;
     }
    }
   }
  }
 }
}
