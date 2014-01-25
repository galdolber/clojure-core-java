package clojure;

import clojure.lang.*;

public final class main_repl_read_eval_print__6791 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*read-eval*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "unknown");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "*3");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "*2");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "*1");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "*e");
 }
 Object print6;
 Object request_exit14;
 Object read8;
 Object eval7;
 Object caught5;
 Object request_prompt13;
 public main_repl_read_eval_print__6791(final Object print6, final Object request_exit14, final Object read8, final Object eval7, final Object caught5, final Object request_prompt13) {
  super();
  this.print6 = print6;
  this.request_exit14 = request_exit14;
  this.read8 = read8;
  this.eval7 = eval7;
  this.caught5 = caught5;
  this.request_prompt13 = request_prompt13;
 }
 public java.lang.Object invoke() {
  try {
   {
    Object read_eval3 = const__0.get();
    Object __r4454 = null;
    {
     Object __r4455;
     if (clojure.lang.Util.equiv(((java.lang.Object)const__4), ((java.lang.Object)const__0.get()))) {
      __r4455 = Boolean.TRUE;
     } else {
      __r4455 = const__0.get();
     }
     ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__0, __r4455));
     __r4454 = ((IFn)new clojure.main_repl_read_eval_print__6791_fn__6792(this.request_exit14, this.read8, this.request_prompt13)).invoke();
    }
    Object input4 = __r4454;
    {
     Object or__3968__auto__5 = ((IFn)RT.set(this.request_prompt13, this.request_exit14)).invoke(input4);
     Object __r4457 = or__3968__auto__5;
     if (__r4457 != null && !(__r4457 == Boolean.FALSE)) {
      return or__3968__auto__5;
     } else {
      {
       Object __r4458 = null;
       {
        ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__0, read_eval3));
        __r4458 = ((IFn)new clojure.main_repl_read_eval_print__6791_fn__6794(this.eval7, input4)).invoke();
       }
       Object value6 = __r4458;
       ((IFn)this.print6).invoke(value6);
       const__5.set(const__6.get());
       const__6.set(const__7.get());
       return const__7.set(value6);
      }
     }
    }
   }
  }
  catch (Throwable ex___) {
   if (ex___ instanceof java.lang.Throwable) {
    java.lang.Throwable e7 = (java.lang.Throwable) ex___;
    ((IFn)this.caught5).invoke(e7);
    return const__8.set(e7);
   }
   else {
    throw Util.sneakyThrow(ex___);
   }
  }
 }
}
