package clojure;

import clojure.lang.*;

public final class core_print_annotation_value extends clojure.lang.AFunction {
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
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final java.lang.Object const__15;
 public static final java.lang.Object const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "print-annotation-value");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "eval");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__9 = (java.lang.Object)java.lang.Enum.class;
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "class?");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__15 = (java.lang.Object)0L;
  const__16 = (java.lang.Object)1L;
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "resolve");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "process-print-annotation");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
 }
 public core_print_annotation_value() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object v1) {
  Object __r2963 = ((IFn)const__0.getRawRoot()).invoke(v1);
  if (__r2963 != null && !(__r2963 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke("{", ((IFn)const__2.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__3.getRawRoot()).invoke(", ", ((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), v1))), "}");
  } else {
   Object __r2965 = ((IFn)const__6.getRawRoot()).invoke(v1);
   if (__r2965 != null && !(__r2965 == Boolean.FALSE)) {
    {
     Object ev2 = ((IFn)const__7.getRawRoot()).invoke(v1);
     if ((ev2 instanceof java.lang.Enum)) {
      return ((IFn)const__1.getRawRoot()).invoke(((java.lang.String)((java.lang.Class)((IFn)const__10.getRawRoot()).invoke(ev2)).getCanonicalName()), ".", ((IFn)const__1.getRawRoot()).invoke(ev2));
     } else {
      Object __r2968 = ((IFn)const__11.getRawRoot()).invoke(ev2);
      if (__r2968 != null && !(__r2968 == Boolean.FALSE)) {
       return ((IFn)const__1.getRawRoot()).invoke(Reflector.invokeNoArgInstanceMember(ev2, "getCanonicalName"), ".class");
      } else {
       Object __r2970 = const__12;
       if (__r2970 != null && !(__r2970 == Boolean.FALSE)) {
        Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke("Unsupported annotation value: ", v1, " of class ", ((IFn)const__10.getRawRoot()).invoke(ev2)))));
        return null;
       } else {
        return null;
       }
      }
     }
    }
   } else {
    Object __r2972 = ((IFn)const__13.getRawRoot()).invoke(v1);
    if (__r2972 != null && !(__r2972 == Boolean.FALSE)) {
     {
      Object vec__48353 = v1;
      Object nested4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__48353), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object nv5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__48353), (int)RT.intCast(1L), ((java.lang.Object)null)));
      Object c6 = ((IFn)const__17.getRawRoot()).invoke(nested4);
      return ((IFn)const__1.getRawRoot()).invoke("@", Reflector.invokeNoArgInstanceMember(c6, "getCanonicalName"), "(", ((IFn)const__18.getRawRoot()).invoke(nv5), ")");
     }
    } else {
     Object __r2974 = ((IFn)const__19.getRawRoot()).invoke(v1);
     if (__r2974 != null && !(__r2974 == Boolean.FALSE)) {
      return ((IFn)const__1.getRawRoot()).invoke("\"", ((java.lang.String)clojure.lang.Compiler.escapeString((java.lang.String)((java.lang.String)v1))), "\"");
     } else {
      if (clojure.lang.Util.identical(((java.lang.Object)v1), ((java.lang.Object)null))) {
       return "";
      } else {
       Object __r2977 = const__12;
       if (__r2977 != null && !(__r2977 == Boolean.FALSE)) {
        return v1;
       } else {
        return null;
       }
      }
     }
    }
   }
  }
 }
}
