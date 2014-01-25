package clojure.core;

import clojure.lang.*;

public final class VecSeq extends java.lang.Object implements clojure.lang.ISeq, clojure.core.protocols.InternalReduce, clojure.lang.Seqable, clojure.lang.IChunkedSeq, clojure.lang.IType {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Var const__9;
 public static final java.lang.Object const__10;
 public static final java.lang.Object const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Var const__16;
 public static final java.lang.Object const__17;
 public static final java.lang.Object const__18;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__3 = (java.lang.Object)0L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__5 = (java.lang.Object)1L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__8 = (java.lang.Object)clojure.lang.Counted.class;
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "identical?");
  const__10 = (java.lang.Object)clojure.lang.Sequential.class;
  const__11 = (java.lang.Object)java.util.List.class;
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "bit-and");
  const__17 = (java.lang.Object)65504L;
  const__18 = (java.lang.Object)32L;
 }
 public  final Object am;
 public  final Object vec;
 public  final Object anode;
 public  final int i;
 public  final int offset;
 public VecSeq(final Object am, final Object vec, final Object anode, final int i, final int offset) {
  super();
  this.am = am;
  this.vec = vec;
  this.anode = anode;
  this.i = i;
  this.offset = offset;
 }
 public static clojure.lang.IPersistentVector getBasis() {
  return RT.vector(((clojure.lang.IObj)Symbol.intern(null, "am")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "clojure.core.ArrayManager"))), ((clojure.lang.IObj)Symbol.intern(null, "vec")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "clojure.core.IVecImpl"))), Symbol.intern(null, "anode"), ((clojure.lang.IObj)Symbol.intern(null, "i")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "int"))), ((clojure.lang.IObj)Symbol.intern(null, "offset")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "int"))));
 }
 public java.lang.Object internal_reduce(java.lang.Object f1, java.lang.Object val2)  {
  {
   Object result3 = val2;
   long aidx4 = clojure.lang.RT.longCast((int)offset);
   while(true) {
    if (clojure.lang.Numbers.lt((long)aidx4, (long)clojure.lang.RT.count(((java.lang.Object)this.vec)))) {
     {
      Object node5 = ((java.lang.Object)((clojure.core.IVecImpl)this.vec).arrayFor((int)RT.intCast(aidx4)));
      Object result6 = ((IFn)new clojure.core.VecSeq_fn__6158(result3, node5, this.am, aidx4, f1)).invoke();
      java.lang.Object result3___aux = result6;
      long aidx4___aux = clojure.lang.Numbers.and((long)65504L, (long)clojure.lang.Numbers.add((long)aidx4, (long)32L));
      result3 = result3___aux;
      aidx4 = aidx4___aux;
      continue;
     }
    } else {
     return result3;
    }
   }
  }
 }
 public clojure.lang.IPersistentCollection empty()  {
  return (clojure.lang.IPersistentCollection)((clojure.lang.PersistentList.EmptyList)clojure.lang.PersistentList.EMPTY);
 }
 public boolean equiv(java.lang.Object o1)  {
  if (clojure.lang.Util.identical(((java.lang.Object)this), ((java.lang.Object)o1))) {
   return RT.booleanCast(Boolean.TRUE);
  } else {
   Object __r3894 = null;
   boolean or__3968__auto__2 = (o1 instanceof clojure.lang.Sequential);
   Object __r3895;
   if (or__3968__auto__2) {
    __r3895 = or__3968__auto__2;
   } else {
    __r3895 = (o1 instanceof java.util.List);
   }
   if ((java.lang.Boolean)__r3895) {
    {
     Object me3 = this;
     Object you4 = ((IFn)const__12.getRawRoot()).invoke(o1);
     while(true) {
      if (clojure.lang.Util.identical(((java.lang.Object)me3), ((java.lang.Object)null))) {
       return RT.booleanCast((clojure.lang.Util.identical(((java.lang.Object)you4), ((java.lang.Object)null)) ? Boolean.TRUE : Boolean.FALSE));
      } else {
       {
        boolean and__3966__auto__5 = clojure.lang.Util.equiv(((java.lang.Object)((IFn)const__14.getRawRoot()).invoke(me3)), ((java.lang.Object)((IFn)const__14.getRawRoot()).invoke(you4)));
        if (and__3966__auto__5) {
         java.lang.Object me3___aux = ((IFn)const__6.getRawRoot()).invoke(me3);
         java.lang.Object you4___aux = ((IFn)const__6.getRawRoot()).invoke(you4);
         me3 = me3___aux;
         you4 = you4___aux;
         continue;
        } else {
         return RT.booleanCast((and__3966__auto__5 ? Boolean.TRUE : Boolean.FALSE));
        }
       }
      }
     }
    }
   } else {
    Object __r3899 = const__15;
    if (__r3899 != null && !(__r3899 == Boolean.FALSE)) {
     return RT.booleanCast(Boolean.FALSE);
    } else {
     return RT.booleanCast(null);
    }
   }
  }
 }
 public int count()  {
  long i1 = 1L;
  Object s2 = ((IFn)const__6.getRawRoot()).invoke(this);
  while(true) {
   Object __r3901 = s2;
   if (__r3901 != null && !(__r3901 == Boolean.FALSE)) {
    if ((s2 instanceof clojure.lang.Counted)) {
     return RT.intCast(clojure.lang.Numbers.add((long)i1, (long)((clojure.lang.IPersistentCollection)s2).count()));
    } else {
     long i1___aux = clojure.lang.Numbers.inc((long)i1);
     java.lang.Object s2___aux = ((IFn)const__6.getRawRoot()).invoke(s2);
     i1 = i1___aux;
     s2 = s2___aux;
     continue;
    }
   } else {
    return RT.intCast(i1);
   }
  }
 }
 public clojure.lang.ISeq cons(java.lang.Object o1)  {
  return (clojure.lang.ISeq)new clojure.lang.Cons(((java.lang.Object)o1), (clojure.lang.ISeq)((clojure.lang.ISeq)this));
 }
 public clojure.lang.ISeq more()  {
  {
   Object s1 = ((clojure.lang.ISeq)((clojure.lang.ISeq)this).next());
   {
    Object or__3968__auto__2 = s1;
    Object __r3904 = or__3968__auto__2;
    if (__r3904 != null && !(__r3904 == Boolean.FALSE)) {
     return (clojure.lang.ISeq)or__3968__auto__2;
    } else {
     return (clojure.lang.ISeq)((clojure.lang.PersistentList.EmptyList)clojure.lang.PersistentList.EMPTY);
    }
   }
  }
 }
 public clojure.lang.ISeq next()  {
  if (clojure.lang.Numbers.lt((long)clojure.lang.Numbers.inc((long)offset), (long)((clojure.core.ArrayManager)this.am).alength(((java.lang.Object)this.anode)))) {
   return (clojure.lang.ISeq)new clojure.core.VecSeq(((java.lang.Object)this.am), ((java.lang.Object)this.vec), ((java.lang.Object)this.anode), (int)i, (int)RT.intCast(clojure.lang.Numbers.inc((long)offset)));
  } else {
   return (clojure.lang.ISeq)((clojure.lang.ISeq)((clojure.lang.IChunkedSeq)this).chunkedNext());
  }
 }
 public java.lang.Object first()  {
  return ((java.lang.Object)((clojure.core.ArrayManager)this.am).aget(((java.lang.Object)this.anode), (int)offset));
 }
 public clojure.lang.ISeq seq()  {
  return (clojure.lang.ISeq)this;
 }
 public clojure.lang.ISeq chunkedMore()  {
  {
   Object s1 = ((clojure.lang.ISeq)((clojure.lang.IChunkedSeq)this).chunkedNext());
   {
    Object or__3968__auto__2 = s1;
    Object __r3907 = or__3968__auto__2;
    if (__r3907 != null && !(__r3907 == Boolean.FALSE)) {
     return (clojure.lang.ISeq)or__3968__auto__2;
    } else {
     return (clojure.lang.ISeq)((clojure.lang.PersistentList.EmptyList)clojure.lang.PersistentList.EMPTY);
    }
   }
  }
 }
 public clojure.lang.ISeq chunkedNext()  {
  {
   long nexti1 = clojure.lang.Numbers.add((long)i, (long)((clojure.core.ArrayManager)this.am).alength(((java.lang.Object)this.anode)));
   if (clojure.lang.Numbers.lt((long)nexti1, (long)clojure.lang.RT.count(((java.lang.Object)this.vec)))) {
    return (clojure.lang.ISeq)new clojure.core.VecSeq(((java.lang.Object)this.am), ((java.lang.Object)this.vec), ((java.lang.Object)((java.lang.Object)((clojure.core.IVecImpl)this.vec).arrayFor((int)RT.intCast(nexti1)))), (int)RT.intCast(nexti1), (int)RT.intCast(0L));
   } else {
    return (clojure.lang.ISeq)null;
   }
  }
 }
 public clojure.lang.IChunk chunkedFirst()  {
  return (clojure.lang.IChunk)new clojure.core.ArrayChunk(((java.lang.Object)this.am), ((java.lang.Object)this.anode), (int)offset, (int)((clojure.core.ArrayManager)this.am).alength(((java.lang.Object)this.anode)));
 }
}
