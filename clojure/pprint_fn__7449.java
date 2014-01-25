package clojure;

import clojure.lang.*;

public final class pprint_fn__7449 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block-callback");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "end");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "suffix");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "base");
 }
 public pprint_fn__7449() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object token2) {
  {
   Object temp__4117__auto__3 = RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this1)), Keyword.intern(null, "logical-block-callback"));
   Object __r4866 = temp__4117__auto__3;
   if (__r4866 != null && !(__r4866 == Boolean.FALSE)) {
    {
     Object cb4 = temp__4117__auto__3;
     ((IFn)cb4).invoke(const__2);
    }
   } else {
   }
  }
  {
   Object temp__4117__auto__5 = RT.get(RT.get(token2, Keyword.intern(null, "logical-block")), Keyword.intern(null, "suffix"));
   Object __r4868 = temp__4117__auto__5;
   if (__r4868 != null && !(__r4868 == Boolean.FALSE)) {
    {
     Object suffix6 = temp__4117__auto__5;
     return Reflector.invokeInstanceMethod(RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")), "write", new Object[]{suffix6});
    }
   } else {
    return null;
   }
  }
 }
}
