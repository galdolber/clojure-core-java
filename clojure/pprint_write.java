package clojure;

import clojure.lang.*;

public final class pprint_write extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.IPersistentMap const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
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
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "merge");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "stream");
  const__2 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "stream"), Boolean.TRUE);
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "table-ize");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "write-option-table");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-base*");
  const__10 = (java.lang.Object)10L;
  const__11 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-radix*");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "pr");
  const__13 = (clojure.lang.Var)RT.var("clojure.pprint", "pr-with-base");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__16 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-pretty*");
  const__17 = (clojure.lang.Var)RT.var("clojure.pprint", "pretty-writer?");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__19 = (clojure.lang.Var)RT.var("clojure.pprint", "make-pretty-writer");
  const__20 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-right-margin*");
  const__21 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-miser-width*");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
 }
 public pprint_write() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object object1, java.lang.Object kw_args2) {
  {
   Object options3 = ((IFn)const__0.getRawRoot()).invoke(const__2, ((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), kw_args2));
   clojure.lang.Var.pushThreadBindings((clojure.lang.Associative)((clojure.lang.Associative)((IFn)const__5.getRawRoot()).invoke(const__6.getRawRoot(), options3)));
   try {
    Object __r5010;
    Object __r5011 = null;
    {
     Object or__3968__auto__6 = ((IFn)const__7.getRawRoot()).invoke((clojure.lang.Util.equiv(((java.lang.Object)const__9.get()), (long)10L) ? Boolean.TRUE : Boolean.FALSE));
     Object __r5012;
     Object __r5013 = or__3968__auto__6;
     if (__r5013 != null && !(__r5013 == Boolean.FALSE)) {
      __r5012 = or__3968__auto__6;
     } else {
      __r5012 = const__11.get();
     }
     __r5011 = __r5012;
    }
    Object __r5014 = __r5011;
    if (__r5014 != null && !(__r5014 == Boolean.FALSE)) {
     __r5010 = RT.mapUniqueKeys(const__12, const__13.getRawRoot());
    } else {
     __r5010 = clojure.lang.PersistentArrayMap.EMPTY;
    }
    clojure.lang.Var.pushThreadBindings((clojure.lang.Associative)((clojure.lang.Associative)__r5010));
    try {
     {
      Object __r5015;
      Object __r5016 = ((IFn)const__14.getRawRoot()).invoke(options3, const__1);
      if (__r5016 != null && !(__r5016 == Boolean.FALSE)) {
       __r5015 = RT.get(options3, Keyword.intern(null, "stream"));
      } else {
       __r5015 = Boolean.TRUE;
      }
      Object optval9 = __r5015;
      Object __r5017 = null;
      {
       Object pred__762310 = const__8.getRawRoot();
       Object expr__762411 = optval9;
       Object __r5018;
       Object __r5019 = ((IFn)pred__762310).invoke(null, expr__762411);
       if (__r5019 != null && !(__r5019 == Boolean.FALSE)) {
        __r5018 = new java.io.StringWriter();
       } else {
        Object __r5020;
        Object __r5021 = ((IFn)pred__762310).invoke(Boolean.TRUE, expr__762411);
        if (__r5021 != null && !(__r5021 == Boolean.FALSE)) {
         __r5020 = const__15.get();
        } else {
         __r5020 = optval9;
        }
        __r5018 = __r5020;
       }
       __r5017 = __r5018;
      }
      Object base_writer12 = __r5017;
      Object __r5023 = const__16.get();
      if (__r5023 != null && !(__r5023 == Boolean.FALSE)) {
       {
        Object base_writer__7617__auto__13 = base_writer12;
        Object new_writer__7618__auto__14 = ((IFn)const__7.getRawRoot()).invoke(((IFn)const__17.getRawRoot()).invoke(base_writer__7617__auto__13));
        {
         Object __r5024;
         Object __r5025 = new_writer__7618__auto__14;
         if (__r5025 != null && !(__r5025 == Boolean.FALSE)) {
          __r5024 = ((IFn)const__19.getRawRoot()).invoke(base_writer__7617__auto__13, const__20.get(), const__21.get());
         } else {
          __r5024 = base_writer__7617__auto__13;
         }
         ((IFn)const__18.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__15, __r5024));
         ((IFn)new clojure.pprint_write_fn__7626(object1)).invoke();
        }
       }
      } else {
       {
        ((IFn)const__18.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__15, base_writer12));
        ((IFn)new clojure.pprint_write_fn__7628(object1)).invoke();
       }
      }
      if (clojure.lang.Util.identical(((java.lang.Object)optval9), ((java.lang.Object)null))) {
       return ((java.lang.String)((java.io.StringWriter)base_writer12).toString());
      } else {
       return null;
      }
     }
    } finally {
     clojure.lang.Var.popThreadBindings();
    }
   } finally {
    clojure.lang.Var.popThreadBindings();
   }
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
