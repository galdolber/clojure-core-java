package clojure;

import clojure.lang.*;

public final class pprint_pprint_ns_reference_fn__8281 extends clojure.lang.AFunction {
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
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "start-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "cached-compile");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "sequential?");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "brackets");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__9 = (java.lang.Object)0L;
  const__10 = (java.lang.Object)1L;
  const__11 = (clojure.lang.Var)RT.var("clojure.pprint", "level-exceeded");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__13 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-level*");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "var-get");
  const__16 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-length*");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__18 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__19 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object keyw6;
 Object end4;
 Object start3;
 Object args7;
 public pprint_pprint_ns_reference_fn__8281(final Object keyw6, final Object end4, final Object start3, final Object args7) {
  super();
  this.keyw6 = keyw6;
  this.end4 = end4;
  this.start3 = start3;
  this.args7 = args7;
 }
 public java.lang.Object invoke() {
  try {
   try {
    ((IFn)const__0).invoke(const__1.get(), this.start3, null, this.end4);
    Object __r5995 = null;
    {
     Object format_in__8216__auto__3 = "~w~:i";
     Object __r5996;
     Object __r5997 = ((IFn)const__2.getRawRoot()).invoke(format_in__8216__auto__3);
     if (__r5997 != null && !(__r5997 == Boolean.FALSE)) {
      __r5996 = ((IFn)const__3).invoke(format_in__8216__auto__3);
     } else {
      __r5996 = format_in__8216__auto__3;
     }
     Object cf__8217__auto__4 = __r5996;
     __r5995 = new clojure.pprint_pprint_ns_reference_fn__8281_fn__8282(cf__8217__auto__4);
    }
    ((IFn)__r5995).invoke(this.keyw6);
    {
     Object args5 = this.args7;
     while(true) {
      Object __r5999 = ((IFn)const__4.getRawRoot()).invoke(args5);
      if (__r5999 != null && !(__r5999 == Boolean.FALSE)) {
       Object __r6000 = null;
       {
        Object format_in__8216__auto__6 = " ";
        Object __r6001;
        Object __r6002 = ((IFn)const__2.getRawRoot()).invoke(format_in__8216__auto__6);
        if (__r6002 != null && !(__r6002 == Boolean.FALSE)) {
         __r6001 = ((IFn)const__3).invoke(format_in__8216__auto__6);
        } else {
         __r6001 = format_in__8216__auto__6;
        }
        Object cf__8217__auto__7 = __r6001;
        __r6000 = new clojure.pprint_pprint_ns_reference_fn__8281_fn__8285(cf__8217__auto__7);
       }
       ((IFn)__r6000).invoke();
       {
        Object arg8 = ((IFn)const__5.getRawRoot()).invoke(args5);
        Object __r6004 = ((IFn)const__6.getRawRoot()).invoke(arg8);
        if (__r6004 != null && !(__r6004 == Boolean.FALSE)) {
         {
          Object vec__82889 = ((IFn)const__7.getRawRoot()).invoke(arg8);
          Object start10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__82889), (int)RT.intCast(0L), ((java.lang.Object)null)));
          Object end11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__82889), (int)RT.intCast(1L), ((java.lang.Object)null)));
          Object __r6006 = ((IFn)const__11).invoke();
          if (__r6006 != null && !(__r6006 == Boolean.FALSE)) {
           ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)"#"));
          } else {
           ((IFn)const__12.getRawRoot()).invoke(RT.map(const__13, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__15.getRawRoot()).invoke(const__13)))), const__16, const__9));
           ((IFn)new clojure.pprint_pprint_ns_reference_fn__8281_fn__8289(arg8, start10, end11)).invoke();
          }
          Object __r6008 = ((IFn)const__17.getRawRoot()).invoke(args5);
          if (__r6008 != null && !(__r6008 == Boolean.FALSE)) {
           Object __r6009 = null;
           {
            Object format_in__8216__auto__12 = "~_";
            Object __r6010;
            Object __r6011 = ((IFn)const__2.getRawRoot()).invoke(format_in__8216__auto__12);
            if (__r6011 != null && !(__r6011 == Boolean.FALSE)) {
             __r6010 = ((IFn)const__3).invoke(format_in__8216__auto__12);
            } else {
             __r6010 = format_in__8216__auto__12;
            }
            Object cf__8217__auto__13 = __r6010;
            __r6009 = new clojure.pprint_pprint_ns_reference_fn__8281_fn__8308(cf__8217__auto__13);
           }
           ((IFn)__r6009).invoke();
          } else {
          }
         }
        } else {
         ((IFn)const__18.getRawRoot()).invoke(arg8);
         Object __r6013 = ((IFn)const__17.getRawRoot()).invoke(args5);
         if (__r6013 != null && !(__r6013 == Boolean.FALSE)) {
          Object __r6014 = null;
          {
           Object format_in__8216__auto__14 = "~:_";
           Object __r6015;
           Object __r6016 = ((IFn)const__2.getRawRoot()).invoke(format_in__8216__auto__14);
           if (__r6016 != null && !(__r6016 == Boolean.FALSE)) {
            __r6015 = ((IFn)const__3).invoke(format_in__8216__auto__14);
           } else {
            __r6015 = format_in__8216__auto__14;
           }
           Object cf__8217__auto__15 = __r6015;
           __r6014 = new clojure.pprint_pprint_ns_reference_fn__8281_fn__8311(cf__8217__auto__15);
          }
          ((IFn)__r6014).invoke();
         } else {
         }
        }
       }
       java.lang.Object args5___aux = ((IFn)const__17.getRawRoot()).invoke(args5);
       args5 = args5___aux;
       continue;
      } else {
      }
      break;
     }
    }
    return ((IFn)const__19).invoke(const__1.get());
   } finally {
    ((IFn)const__20.getRawRoot()).invoke();
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
