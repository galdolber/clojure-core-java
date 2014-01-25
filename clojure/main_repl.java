package clojure;

import clojure.lang.*;

public final class main_repl extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Var const__18;
 public static final java.lang.Object const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Keyword const__21;
 public static final clojure.lang.Var const__22;
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
 public static final clojure.lang.Var const__34;
 public static final clojure.lang.Var const__35;
 public static final clojure.lang.Var const__36;
 public static final clojure.lang.Var const__37;
 public static final clojure.lang.Var const__38;
 public static final clojure.lang.Var const__39;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "caught");
  const__6 = (clojure.lang.Var)RT.var("clojure.main", "repl-caught");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "print");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "prn");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "eval");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "eval");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "read");
  const__12 = (clojure.lang.Var)RT.var("clojure.main", "repl-read");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "flush");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "flush");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "prompt");
  const__16 = (clojure.lang.Var)RT.var("clojure.main", "repl-prompt");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "need-prompt");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__19 = (java.lang.Object)clojure.lang.LineNumberingPushbackReader.class;
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "*in*");
  const__21 = (clojure.lang.Keyword)Keyword.intern(null, "init");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "*warn-on-reflection*");
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "*math-context*");
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "*print-meta*");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "*print-length*");
  const__28 = (clojure.lang.Var)RT.var("clojure.core", "*print-level*");
  const__29 = (clojure.lang.Var)RT.var("clojure.core", "*data-readers*");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "*default-data-reader-fn*");
  const__31 = (clojure.lang.Var)RT.var("clojure.core", "*compile-path*");
  const__32 = (clojure.lang.Var)RT.var("clojure.core", "*command-line-args*");
  const__33 = (clojure.lang.Var)RT.var("clojure.core", "*unchecked-math*");
  const__34 = (clojure.lang.Var)RT.var("clojure.core", "*assert*");
  const__35 = (clojure.lang.Var)RT.var("clojure.core", "*1");
  const__36 = (clojure.lang.Var)RT.var("clojure.core", "*2");
  const__37 = (clojure.lang.Var)RT.var("clojure.core", "*3");
  const__38 = (clojure.lang.Var)RT.var("clojure.core", "*e");
  const__39 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public main_repl() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object options1) {
  {
   Object cl2 = ((java.lang.ClassLoader)((java.lang.Thread)((java.lang.Thread)java.lang.Thread.currentThread())).getContextClassLoader());
   ((java.lang.Thread)((java.lang.Thread)java.lang.Thread.currentThread())).setContextClassLoader((java.lang.ClassLoader)((java.lang.ClassLoader)new clojure.lang.DynamicClassLoader((java.lang.ClassLoader)((java.lang.ClassLoader)cl2))));
  }
  {
   Object map__67843 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), options1);
   Object __r4459;
   Object __r4460 = ((IFn)const__2.getRawRoot()).invoke(map__67843);
   if (__r4460 != null && !(__r4460 == Boolean.FALSE)) {
    __r4459 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__3.getRawRoot()).invoke(map__67843))));
   } else {
    __r4459 = map__67843;
   }
   Object map__67844 = __r4459;
   Object caught5 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__67844), ((java.lang.Object)const__5), ((java.lang.Object)const__6.getRawRoot())));
   Object print6 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__67844), ((java.lang.Object)const__7), ((java.lang.Object)const__8.getRawRoot())));
   Object eval7 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__67844), ((java.lang.Object)const__9), ((java.lang.Object)const__10.getRawRoot())));
   Object read8 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__67844), ((java.lang.Object)const__11), ((java.lang.Object)const__12.getRawRoot())));
   Object flush9 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__67844), ((java.lang.Object)const__13), ((java.lang.Object)const__14.getRawRoot())));
   Object prompt10 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__67844), ((java.lang.Object)const__15), ((java.lang.Object)const__16.getRawRoot())));
   Object __r4461;
   if ((const__20.get() instanceof clojure.lang.LineNumberingPushbackReader)) {
    __r4461 = new clojure.main_repl_fn__6785();
   } else {
    __r4461 = new clojure.main_repl_fn__6787();
   }
   Object need_prompt11 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__67844), ((java.lang.Object)const__17), ((java.lang.Object)__r4461)));
   Object init12 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__67844), ((java.lang.Object)const__21), ((java.lang.Object)new clojure.main_repl_fn__6789())));
   Object request_prompt13 = new java.lang.Object();
   Object request_exit14 = new java.lang.Object();
   Object read_eval_print15 = new clojure.main_repl_read_eval_print__6791(print6, request_exit14, read8, eval7, caught5, request_prompt13);
   {
    ((IFn)const__22.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__23, const__23.get(), const__24, const__24.get(), const__25, const__25.get(), const__26, const__26.get(), const__27, const__27.get(), const__28, const__28.get(), const__29, const__29.get(), const__30, const__30.get(), const__31, ((java.lang.String)java.lang.System.getProperty((java.lang.String)((java.lang.String)"clojure.compile.path"), (java.lang.String)((java.lang.String)"classes"))), const__32, const__32.get(), const__33, const__33.get(), const__34, const__34.get(), const__35, null, const__36, null, const__37, null, const__38, null));
    try {
     ((IFn)new clojure.main_repl_fn__6798(init12, caught5)).invoke();
     ((IFn)prompt10).invoke();
     ((IFn)flush9).invoke();
     {
      while(true) {
       Object __r4463 = ((IFn)new clojure.main_repl_fn__6800(read_eval_print15, request_exit14, caught5)).invoke();
       if (__r4463 != null && !(__r4463 == Boolean.FALSE)) {
        return null;
       } else {
        Object __r4465 = ((IFn)need_prompt11).invoke();
        if (__r4465 != null && !(__r4465 == Boolean.FALSE)) {
         ((IFn)prompt10).invoke();
         ((IFn)flush9).invoke();
        } else {
        }
        continue;
       }
      }
     }
    } finally {
     ((IFn)const__39.getRawRoot()).invoke();
    }
   }
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}
