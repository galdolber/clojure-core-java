package clojure;

import clojure.lang.*;

public final class core_derive extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.IPersistentStack const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.IPersistentStack const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.IPersistentStack const__12;
 public static final clojure.lang.IPersistentStack const__13;
 public static final clojure.lang.IPersistentStack const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "namespace");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pr-str");
  const__3 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "namespace"), Symbol.intern(null, "parent")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 5134, Keyword.intern(null, "column"), 12));
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "class?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__6 = (java.lang.Object)clojure.lang.Named.class;
  const__7 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "or"), ((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "class?"), Symbol.intern(null, "tag")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 5135, Keyword.intern(null, "column"), 16)), ((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "and"), ((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "instance?"), Symbol.intern(null, "clojure.lang.Named"), Symbol.intern(null, "tag")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 5135, Keyword.intern(null, "column"), 34)), ((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "namespace"), Symbol.intern(null, "tag")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 5135, Keyword.intern(null, "column"), 69))))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 5135, Keyword.intern(null, "column"), 29))))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 5135, Keyword.intern(null, "column"), 12));
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "alter-var-root");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "global-hierarchy");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "derive");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "not=");
  const__12 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "not="), Symbol.intern(null, "tag"), Symbol.intern(null, "parent")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 5139, Keyword.intern(null, "column"), 12));
  const__13 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "or"), ((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "class?"), Symbol.intern(null, "tag")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 5140, Keyword.intern(null, "column"), 16)), ((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "instance?"), Symbol.intern(null, "clojure.lang.Named"), Symbol.intern(null, "tag")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 5140, Keyword.intern(null, "column"), 29))))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 5140, Keyword.intern(null, "column"), 12));
  const__14 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "instance?"), Symbol.intern(null, "clojure.lang.Named"), Symbol.intern(null, "parent")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 5141, Keyword.intern(null, "column"), 12));
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "parents");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "descendants");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "ancestors");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "print-str");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "get");
 }
 public core_derive() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object h1, java.lang.Object tag2, java.lang.Object parent3) {
  Object __r3072 = ((IFn)const__11.getRawRoot()).invoke(tag2, parent3);
  if (__r3072 != null && !(__r3072 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.AssertionError(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke("Assert failed: ", ((IFn)const__2.getRawRoot()).invoke(const__12)))));
  }
  Object __r3074 = null;
  {
   Object or__3968__auto__4 = ((IFn)const__4.getRawRoot()).invoke(tag2);
   Object __r3075;
   Object __r3076 = or__3968__auto__4;
   if (__r3076 != null && !(__r3076 == Boolean.FALSE)) {
    __r3075 = or__3968__auto__4;
   } else {
    __r3075 = ((tag2 instanceof clojure.lang.Named) ? Boolean.TRUE : Boolean.FALSE);
   }
   __r3074 = __r3075;
  }
  Object __r3077 = __r3074;
  if (__r3077 != null && !(__r3077 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.AssertionError(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke("Assert failed: ", ((IFn)const__2.getRawRoot()).invoke(const__13)))));
  }
  if ((parent3 instanceof clojure.lang.Named)) {
  } else {
   Util.trow((Throwable)new java.lang.AssertionError(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke("Assert failed: ", ((IFn)const__2.getRawRoot()).invoke(const__14)))));
  }
  {
   Object tp5 = RT.get(h1, Keyword.intern(null, "parents"));
   Object td6 = RT.get(h1, Keyword.intern(null, "descendants"));
   Object ta7 = RT.get(h1, Keyword.intern(null, "ancestors"));
   Object tf8 = new clojure.core_derive_tf__4904();
   {
    Object __r3079;
    Object __r3080 = ((IFn)const__18.getRawRoot()).invoke(((IFn)tp5).invoke(tag2), parent3);
    if (__r3080 != null && !(__r3080 == Boolean.FALSE)) {
     __r3079 = null;
    } else {
     Object __r3082 = ((IFn)const__18.getRawRoot()).invoke(((IFn)ta7).invoke(tag2), parent3);
     if (__r3082 != null && !(__r3082 == Boolean.FALSE)) {
      Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)((IFn)const__19.getRawRoot()).invoke(tag2, "already has", parent3, "as ancestor"))));
     } else {
     }
     Object __r3084 = ((IFn)const__18.getRawRoot()).invoke(((IFn)ta7).invoke(parent3), tag2);
     if (__r3084 != null && !(__r3084 == Boolean.FALSE)) {
      Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)((IFn)const__19.getRawRoot()).invoke("Cyclic derivation:", parent3, "has", tag2, "as ancestor"))));
     } else {
     }
     __r3079 = RT.mapUniqueKeys(const__15, ((IFn)const__20.getRawRoot()).invoke(RT.get(h1, Keyword.intern(null, "parents")), tag2, ((IFn)const__21.getRawRoot()).invoke(((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)tp5), ((java.lang.Object)tag2), ((java.lang.Object)clojure.lang.PersistentHashSet.EMPTY))), parent3)), const__17, ((IFn)tf8).invoke(RT.get(h1, Keyword.intern(null, "ancestors")), tag2, td6, parent3, ta7), const__16, ((IFn)tf8).invoke(RT.get(h1, Keyword.intern(null, "descendants")), parent3, ta7, tag2, td6));
    }
    Object or__3968__auto__9 = __r3079;
    Object __r3086 = or__3968__auto__9;
    if (__r3086 != null && !(__r3086 == Boolean.FALSE)) {
     return or__3968__auto__9;
    } else {
     return h1;
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object tag1, java.lang.Object parent2) {
  Object __r3088 = ((IFn)const__0.getRawRoot()).invoke(parent2);
  if (__r3088 != null && !(__r3088 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.AssertionError(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke("Assert failed: ", ((IFn)const__2.getRawRoot()).invoke(const__3)))));
  }
  Object __r3090 = null;
  {
   Object or__3968__auto__3 = ((IFn)const__4.getRawRoot()).invoke(tag1);
   Object __r3091;
   Object __r3092 = or__3968__auto__3;
   if (__r3092 != null && !(__r3092 == Boolean.FALSE)) {
    __r3091 = or__3968__auto__3;
   } else {
    Object __r3093 = null;
    {
     boolean and__3966__auto__4 = (tag1 instanceof clojure.lang.Named);
     Object __r3094;
     if (and__3966__auto__4) {
      __r3094 = ((IFn)const__0.getRawRoot()).invoke(tag1);
     } else {
      __r3094 = (and__3966__auto__4 ? Boolean.TRUE : Boolean.FALSE);
     }
     __r3093 = __r3094;
    }
    __r3091 = __r3093;
   }
   __r3090 = __r3091;
  }
  Object __r3095 = __r3090;
  if (__r3095 != null && !(__r3095 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.AssertionError(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke("Assert failed: ", ((IFn)const__2.getRawRoot()).invoke(const__7)))));
  }
  ((IFn)const__8.getRawRoot()).invoke(const__9, const__10.getRawRoot(), tag1, parent2);
  return null;
 }
}
